// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Base class for file properties.
 * 
 */
public final class ProjectFilePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProjectFilePropertiesResponse Empty = new ProjectFilePropertiesResponse();

    /**
     * Optional File extension. If submitted it should not have a leading period and must match the extension from filePath.
     * 
     */
    @InputImport(name="extension")
      private final @Nullable String extension;

    public Optional<String> getExtension() {
        return this.extension == null ? Optional.empty() : Optional.ofNullable(this.extension);
    }

    /**
     * Relative path of this file resource. This property can be set when creating or updating the file resource.
     * 
     */
    @InputImport(name="filePath")
      private final @Nullable String filePath;

    public Optional<String> getFilePath() {
        return this.filePath == null ? Optional.empty() : Optional.ofNullable(this.filePath);
    }

    /**
     * Modification DateTime.
     * 
     */
    @InputImport(name="lastModified", required=true)
      private final String lastModified;

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * File content type. This property can be modified to reflect the file content type.
     * 
     */
    @InputImport(name="mediaType")
      private final @Nullable String mediaType;

    public Optional<String> getMediaType() {
        return this.mediaType == null ? Optional.empty() : Optional.ofNullable(this.mediaType);
    }

    /**
     * File size.
     * 
     */
    @InputImport(name="size", required=true)
      private final Double size;

    public Double getSize() {
        return this.size;
    }

    public ProjectFilePropertiesResponse(
        @Nullable String extension,
        @Nullable String filePath,
        String lastModified,
        @Nullable String mediaType,
        Double size) {
        this.extension = extension;
        this.filePath = filePath;
        this.lastModified = Objects.requireNonNull(lastModified, "expected parameter 'lastModified' to be non-null");
        this.mediaType = mediaType;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
    }

    private ProjectFilePropertiesResponse() {
        this.extension = null;
        this.filePath = null;
        this.lastModified = null;
        this.mediaType = null;
        this.size = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFilePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String extension;
        private @Nullable String filePath;
        private String lastModified;
        private @Nullable String mediaType;
        private Double size;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFilePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extension = defaults.extension;
    	      this.filePath = defaults.filePath;
    	      this.lastModified = defaults.lastModified;
    	      this.mediaType = defaults.mediaType;
    	      this.size = defaults.size;
        }

        public Builder extension(@Nullable String extension) {
            this.extension = extension;
            return this;
        }

        public Builder filePath(@Nullable String filePath) {
            this.filePath = filePath;
            return this;
        }

        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder mediaType(@Nullable String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public Builder size(Double size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public ProjectFilePropertiesResponse build() {
            return new ProjectFilePropertiesResponse(extension, filePath, lastModified, mediaType, size);
        }
    }
}
