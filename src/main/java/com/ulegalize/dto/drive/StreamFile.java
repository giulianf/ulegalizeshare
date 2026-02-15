package com.ulegalize.dto.drive;

import java.io.InputStream;

public record StreamFile(InputStream inputStream, String filename) {}

