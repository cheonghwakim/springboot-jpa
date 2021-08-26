package com.bithumb.api.designPatterns;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommandTest {

    class Aircon {
        void turnOn() {
            System.out.println("에어컨 켜기");
        }

        void turnOff() {
            System.out.println("에어컨 끄기");
        }

        void increaseTemp() {
            System.out.println("온도 올리기");
        }

        void decreaseTemp() {
            System.out.println("온도 내리기");
        }
    }

    interface Command  { void execute(); }

    class AirConRemoteControl{
        Command command;
        void setCommand(Command command) {
            this.command = command;
        }

        void buttonPressed() {
            command.execute();
        }
    }

    @Test
    @DisplayName("커맨드 패턴 테스트")
    void main() {
        Aircon aircon = new Aircon();
        AirConRemoteControl control = new AirConRemoteControl();
        control.setCommand(() -> aircon.turnOn());
        control.buttonPressed();    // subscribe 의 원리를 설명함

    }

}
