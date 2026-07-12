# Mobile-Programming

## Overview

Kotlin/Android mobile app development projects

Repository: [JohnAndrewBalbarosa/Mobile-Programming](https://github.com/JohnAndrewBalbarosa/Mobile-Programming)

## Problem and Goal

**Problem.** Android course exercises need one repository where application code, instrumented tests, and unit tests can be reviewed together.

**Goal.** Collect Kotlin/Android mobile-programming implementations and their test suites as an academic development portfolio.

## System Design

- `main/`: Android application source and resources.
- `test/`: local unit tests.
- `androidTest/`: device/emulator instrumentation tests.
- No root Gradle wrapper/build file is currently committed, so the repository is not independently reproducible from the command line.

## Setup and Usage

```bash
# Open the project sources in Android Studio.
# A root Gradle wrapper/build definition is not currently committed;
# add or restore it before claiming a reproducible CLI build.
```

## Evaluation Method

- Define the project task and expected behavior.
- Run representative examples or user flows.
- Record correctness, speed, reliability, usability, and failure cases.

## Results

- No validated quantitative results are published yet.
- Current README status: implementation and usage are documented before formal measurement.

## Interpretation

- The project can be described as implemented or in progress, but impact claims should stay limited until measurements are collected.
- Use the evaluation plan below to turn the project into resume-ready, evidence-backed work.

## Limitations

- Results should only be treated as validated when this README includes the dataset, sample size, metric definition, and reproduction steps.
- Any AI-generated, OCR-based, scraped, or heuristic output requires manual review before being used as ground truth.
- Environment-dependent measurements such as latency, memory use, browser behavior, and API reliability should be re-measured on the target machine.

## Recommendations and Future Work

- Add a small benchmark or validation dataset.
- Report sample size, success rate, error rate, and runtime where applicable.
- Add screenshots, logs, or exported reports that support the measured results.

## Documentation Standard

This README follows a technical-project structure: overview, goal, system design, setup, evaluation method, results, interpretation, limitations, and recommendations. Update the Results section whenever new measurements are available so project claims stay evidence-backed.
