package com.example.mission1.controller;


import com.example.mission1.domain.Calculator;
import com.example.mission1.view.InputView;
import com.example.mission1.view.OutputView;

public class CalculatorController {

    private final OutputView outputView;
    private final InputView inputView;
    private final Calculator calculator;

    public CalculatorController(final OutputView outputView, final InputView inputView, final Calculator calculator) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.calculator = calculator;
    }

    public void applicationRun(){

    }
}
