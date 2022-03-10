// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact agreement framing settings.
 * 
 */
public final class EdifactFramingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdifactFramingSettingsResponse Empty = new EdifactFramingSettingsResponse();

    /**
     * The character encoding.
     * 
     */
    @InputImport(name="characterEncoding")
      private final @Nullable String characterEncoding;

    public Optional<String> getCharacterEncoding() {
        return this.characterEncoding == null ? Optional.empty() : Optional.ofNullable(this.characterEncoding);
    }

    /**
     * The EDIFACT frame setting characterSet.
     * 
     */
    @InputImport(name="characterSet", required=true)
      private final String characterSet;

    public String getCharacterSet() {
        return this.characterSet;
    }

    /**
     * The component separator.
     * 
     */
    @InputImport(name="componentSeparator", required=true)
      private final Integer componentSeparator;

    public Integer getComponentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @InputImport(name="dataElementSeparator", required=true)
      private final Integer dataElementSeparator;

    public Integer getDataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The EDIFACT frame setting decimal indicator.
     * 
     */
    @InputImport(name="decimalPointIndicator", required=true)
      private final String decimalPointIndicator;

    public String getDecimalPointIndicator() {
        return this.decimalPointIndicator;
    }

    /**
     * The protocol version.
     * 
     */
    @InputImport(name="protocolVersion", required=true)
      private final Integer protocolVersion;

    public Integer getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * The release indicator.
     * 
     */
    @InputImport(name="releaseIndicator", required=true)
      private final Integer releaseIndicator;

    public Integer getReleaseIndicator() {
        return this.releaseIndicator;
    }

    /**
     * The repetition separator.
     * 
     */
    @InputImport(name="repetitionSeparator", required=true)
      private final Integer repetitionSeparator;

    public Integer getRepetitionSeparator() {
        return this.repetitionSeparator;
    }

    /**
     * The segment terminator.
     * 
     */
    @InputImport(name="segmentTerminator", required=true)
      private final Integer segmentTerminator;

    public Integer getSegmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The EDIFACT frame setting segment terminator suffix.
     * 
     */
    @InputImport(name="segmentTerminatorSuffix", required=true)
      private final String segmentTerminatorSuffix;

    public String getSegmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * The service code list directory version.
     * 
     */
    @InputImport(name="serviceCodeListDirectoryVersion")
      private final @Nullable String serviceCodeListDirectoryVersion;

    public Optional<String> getServiceCodeListDirectoryVersion() {
        return this.serviceCodeListDirectoryVersion == null ? Optional.empty() : Optional.ofNullable(this.serviceCodeListDirectoryVersion);
    }

    public EdifactFramingSettingsResponse(
        @Nullable String characterEncoding,
        String characterSet,
        Integer componentSeparator,
        Integer dataElementSeparator,
        String decimalPointIndicator,
        Integer protocolVersion,
        Integer releaseIndicator,
        Integer repetitionSeparator,
        Integer segmentTerminator,
        String segmentTerminatorSuffix,
        @Nullable String serviceCodeListDirectoryVersion) {
        this.characterEncoding = characterEncoding;
        this.characterSet = Objects.requireNonNull(characterSet, "expected parameter 'characterSet' to be non-null");
        this.componentSeparator = Objects.requireNonNull(componentSeparator, "expected parameter 'componentSeparator' to be non-null");
        this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
        this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator, "expected parameter 'decimalPointIndicator' to be non-null");
        this.protocolVersion = Objects.requireNonNull(protocolVersion, "expected parameter 'protocolVersion' to be non-null");
        this.releaseIndicator = Objects.requireNonNull(releaseIndicator, "expected parameter 'releaseIndicator' to be non-null");
        this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator, "expected parameter 'repetitionSeparator' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
        this.serviceCodeListDirectoryVersion = serviceCodeListDirectoryVersion;
    }

    private EdifactFramingSettingsResponse() {
        this.characterEncoding = null;
        this.characterSet = null;
        this.componentSeparator = null;
        this.dataElementSeparator = null;
        this.decimalPointIndicator = null;
        this.protocolVersion = null;
        this.releaseIndicator = null;
        this.repetitionSeparator = null;
        this.segmentTerminator = null;
        this.segmentTerminatorSuffix = null;
        this.serviceCodeListDirectoryVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactFramingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String characterEncoding;
        private String characterSet;
        private Integer componentSeparator;
        private Integer dataElementSeparator;
        private String decimalPointIndicator;
        private Integer protocolVersion;
        private Integer releaseIndicator;
        private Integer repetitionSeparator;
        private Integer segmentTerminator;
        private String segmentTerminatorSuffix;
        private @Nullable String serviceCodeListDirectoryVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactFramingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterEncoding = defaults.characterEncoding;
    	      this.characterSet = defaults.characterSet;
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.decimalPointIndicator = defaults.decimalPointIndicator;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.releaseIndicator = defaults.releaseIndicator;
    	      this.repetitionSeparator = defaults.repetitionSeparator;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
    	      this.serviceCodeListDirectoryVersion = defaults.serviceCodeListDirectoryVersion;
        }

        public Builder characterEncoding(@Nullable String characterEncoding) {
            this.characterEncoding = characterEncoding;
            return this;
        }

        public Builder characterSet(String characterSet) {
            this.characterSet = Objects.requireNonNull(characterSet);
            return this;
        }

        public Builder componentSeparator(Integer componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }

        public Builder dataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }

        public Builder decimalPointIndicator(String decimalPointIndicator) {
            this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator);
            return this;
        }

        public Builder protocolVersion(Integer protocolVersion) {
            this.protocolVersion = Objects.requireNonNull(protocolVersion);
            return this;
        }

        public Builder releaseIndicator(Integer releaseIndicator) {
            this.releaseIndicator = Objects.requireNonNull(releaseIndicator);
            return this;
        }

        public Builder repetitionSeparator(Integer repetitionSeparator) {
            this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator);
            return this;
        }

        public Builder segmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }

        public Builder segmentTerminatorSuffix(String segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }

        public Builder serviceCodeListDirectoryVersion(@Nullable String serviceCodeListDirectoryVersion) {
            this.serviceCodeListDirectoryVersion = serviceCodeListDirectoryVersion;
            return this;
        }
        public EdifactFramingSettingsResponse build() {
            return new EdifactFramingSettingsResponse(characterEncoding, characterSet, componentSeparator, dataElementSeparator, decimalPointIndicator, protocolVersion, releaseIndicator, repetitionSeparator, segmentTerminator, segmentTerminatorSuffix, serviceCodeListDirectoryVersion);
        }
    }
}
