// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class X12DelimiterOverridesResponse {
    /**
     * The component separator.
     * 
     */
    private final Integer componentSeparator;
    /**
     * The data element separator.
     * 
     */
    private final Integer dataElementSeparator;
    /**
     * The message id.
     * 
     */
    private final @Nullable String messageId;
    /**
     * The protocol version.
     * 
     */
    private final @Nullable String protocolVersion;
    /**
     * The replacement character.
     * 
     */
    private final Integer replaceCharacter;
    /**
     * The value indicating whether to replace separators in payload.
     * 
     */
    private final Boolean replaceSeparatorsInPayload;
    /**
     * The segment terminator.
     * 
     */
    private final Integer segmentTerminator;
    /**
     * The segment terminator suffix.
     * 
     */
    private final String segmentTerminatorSuffix;
    /**
     * The target namespace on which this delimiter settings has to be applied.
     * 
     */
    private final @Nullable String targetNamespace;

    @OutputCustomType.Constructor({"componentSeparator","dataElementSeparator","messageId","protocolVersion","replaceCharacter","replaceSeparatorsInPayload","segmentTerminator","segmentTerminatorSuffix","targetNamespace"})
    private X12DelimiterOverridesResponse(
        Integer componentSeparator,
        Integer dataElementSeparator,
        @Nullable String messageId,
        @Nullable String protocolVersion,
        Integer replaceCharacter,
        Boolean replaceSeparatorsInPayload,
        Integer segmentTerminator,
        String segmentTerminatorSuffix,
        @Nullable String targetNamespace) {
        this.componentSeparator = componentSeparator;
        this.dataElementSeparator = dataElementSeparator;
        this.messageId = messageId;
        this.protocolVersion = protocolVersion;
        this.replaceCharacter = replaceCharacter;
        this.replaceSeparatorsInPayload = replaceSeparatorsInPayload;
        this.segmentTerminator = segmentTerminator;
        this.segmentTerminatorSuffix = segmentTerminatorSuffix;
        this.targetNamespace = targetNamespace;
    }

    /**
     * The component separator.
     * 
    */
    public Integer getComponentSeparator() {
        return this.componentSeparator;
    }
    /**
     * The data element separator.
     * 
    */
    public Integer getDataElementSeparator() {
        return this.dataElementSeparator;
    }
    /**
     * The message id.
     * 
    */
    public Optional<String> getMessageId() {
        return Optional.ofNullable(this.messageId);
    }
    /**
     * The protocol version.
     * 
    */
    public Optional<String> getProtocolVersion() {
        return Optional.ofNullable(this.protocolVersion);
    }
    /**
     * The replacement character.
     * 
    */
    public Integer getReplaceCharacter() {
        return this.replaceCharacter;
    }
    /**
     * The value indicating whether to replace separators in payload.
     * 
    */
    public Boolean getReplaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }
    /**
     * The segment terminator.
     * 
    */
    public Integer getSegmentTerminator() {
        return this.segmentTerminator;
    }
    /**
     * The segment terminator suffix.
     * 
    */
    public String getSegmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }
    /**
     * The target namespace on which this delimiter settings has to be applied.
     * 
    */
    public Optional<String> getTargetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12DelimiterOverridesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer componentSeparator;
        private Integer dataElementSeparator;
        private @Nullable String messageId;
        private @Nullable String protocolVersion;
        private Integer replaceCharacter;
        private Boolean replaceSeparatorsInPayload;
        private Integer segmentTerminator;
        private String segmentTerminatorSuffix;
        private @Nullable String targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(X12DelimiterOverridesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.messageId = defaults.messageId;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.replaceCharacter = defaults.replaceCharacter;
    	      this.replaceSeparatorsInPayload = defaults.replaceSeparatorsInPayload;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder setComponentSeparator(Integer componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }

        public Builder setDataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setProtocolVersion(@Nullable String protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        public Builder setReplaceCharacter(Integer replaceCharacter) {
            this.replaceCharacter = Objects.requireNonNull(replaceCharacter);
            return this;
        }

        public Builder setReplaceSeparatorsInPayload(Boolean replaceSeparatorsInPayload) {
            this.replaceSeparatorsInPayload = Objects.requireNonNull(replaceSeparatorsInPayload);
            return this;
        }

        public Builder setSegmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }

        public Builder setSegmentTerminatorSuffix(String segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }

        public Builder setTargetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public X12DelimiterOverridesResponse build() {
            return new X12DelimiterOverridesResponse(componentSeparator, dataElementSeparator, messageId, protocolVersion, replaceCharacter, replaceSeparatorsInPayload, segmentTerminator, segmentTerminatorSuffix, targetNamespace);
        }
    }
}
