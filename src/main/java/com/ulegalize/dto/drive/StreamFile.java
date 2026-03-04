package com.ulegalize.dto.drive;

import java.io.InputStream;
import java.text.Normalizer;

public record StreamFile(InputStream inputStream, String filename, boolean empty) {

  public String normalizedFilename() {
    return Normalizer.normalize(filename, Normalizer.Form.NFC);
  }
}

