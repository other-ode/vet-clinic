package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class WhenWeBookAnAppointment {

    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.getPetName(),equalTo("Fido"));
        assertThat(appointment.getOwner(),equalTo("Fred"));
        assertThat(appointment.getAppointmentTime(),equalTo(TODAY_AT_2_PM));

    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        assertThat(appointment.getReason().isPresent(),equalTo(true));
        assertThat(appointment.getReason().get(),equalTo("He is sick"));

        assertThat(appointment.getReason().isPresent(),equalTo(true));

    }

    @Test
    public void check_appointment_time_for_pet(){
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        assertThat(appointment.getAppointmentTime().isBefore(LocalDateTime.now()),lessThanOrEqualTo(true));
        assertThat(appointment.getAppointmentTime().isAfter(LocalDateTime.now()),greaterThanOrEqualTo(true));

    }

}
