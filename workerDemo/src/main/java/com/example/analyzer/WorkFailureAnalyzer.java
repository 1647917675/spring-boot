package com.example.analyzer;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

public class WorkFailureAnalyzer extends AbstractFailureAnalyzer<Throwable> implements FailureAnalyzer{

	@Override
	protected FailureAnalysis analyze(Throwable rootFailure, Throwable cause) {
		return null;
	}

}
