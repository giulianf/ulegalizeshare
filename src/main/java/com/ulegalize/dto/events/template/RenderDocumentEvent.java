package com.ulegalize.dto.events.template;

import java.util.List;

public record RenderDocumentEvent(
    String documentUID,
    String vckey,
    List<String> pathFolders,
    String documentName,
    String format
) {}
