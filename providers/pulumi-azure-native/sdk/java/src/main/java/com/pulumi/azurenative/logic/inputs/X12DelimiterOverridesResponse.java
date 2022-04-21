// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 delimiter override settings.
 * 
 */
public final class X12DelimiterOverridesResponse extends com.pulumi.resources.InvokeArgs {

    public static final X12DelimiterOverridesResponse Empty = new X12DelimiterOverridesResponse();

    /**
     * The component separator.
     * 
     */
    @Import(name="componentSeparator", required=true)
    private Integer componentSeparator;

    public Integer componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @Import(name="dataElementSeparator", required=true)
    private Integer dataElementSeparator;

    public Integer dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The message id.
     * 
     */
    @Import(name="messageId")
    private @Nullable String messageId;

    public Optional<String> messageId() {
        return Optional.ofNullable(this.messageId);
    }

    /**
     * The protocol version.
     * 
     */
    @Import(name="protocolVersion")
    private @Nullable String protocolVersion;

    public Optional<String> protocolVersion() {
        return Optional.ofNullable(this.protocolVersion);
    }

    /**
     * The replacement character.
     * 
     */
    @Import(name="replaceCharacter", required=true)
    private Integer replaceCharacter;

    public Integer replaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * The value indicating whether to replace separators in payload.
     * 
     */
    @Import(name="replaceSeparatorsInPayload", required=true)
    private Boolean replaceSeparatorsInPayload;

    public Boolean replaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }

    /**
     * The segment terminator.
     * 
     */
    @Import(name="segmentTerminator", required=true)
    private Integer segmentTerminator;

    public Integer segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The segment terminator suffix.
     * 
     */
    @Import(name="segmentTerminatorSuffix", required=true)
    private String segmentTerminatorSuffix;

    public String segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * The target namespace on which this delimiter settings has to be applied.
     * 
     */
    @Import(name="targetNamespace")
    private @Nullable String targetNamespace;

    public Optional<String> targetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }

    private X12DelimiterOverridesResponse() {}

    private X12DelimiterOverridesResponse(X12DelimiterOverridesResponse $) {
        this.componentSeparator = $.componentSeparator;
        this.dataElementSeparator = $.dataElementSeparator;
        this.messageId = $.messageId;
        this.protocolVersion = $.protocolVersion;
        this.replaceCharacter = $.replaceCharacter;
        this.replaceSeparatorsInPayload = $.replaceSeparatorsInPayload;
        this.segmentTerminator = $.segmentTerminator;
        this.segmentTerminatorSuffix = $.segmentTerminatorSuffix;
        this.targetNamespace = $.targetNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12DelimiterOverridesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12DelimiterOverridesResponse $;

        public Builder() {
            $ = new X12DelimiterOverridesResponse();
        }

        public Builder(X12DelimiterOverridesResponse defaults) {
            $ = new X12DelimiterOverridesResponse(Objects.requireNonNull(defaults));
        }

        public Builder componentSeparator(Integer componentSeparator) {
            $.componentSeparator = componentSeparator;
            return this;
        }

        public Builder dataElementSeparator(Integer dataElementSeparator) {
            $.dataElementSeparator = dataElementSeparator;
            return this;
        }

        public Builder messageId(@Nullable String messageId) {
            $.messageId = messageId;
            return this;
        }

        public Builder protocolVersion(@Nullable String protocolVersion) {
            $.protocolVersion = protocolVersion;
            return this;
        }

        public Builder replaceCharacter(Integer replaceCharacter) {
            $.replaceCharacter = replaceCharacter;
            return this;
        }

        public Builder replaceSeparatorsInPayload(Boolean replaceSeparatorsInPayload) {
            $.replaceSeparatorsInPayload = replaceSeparatorsInPayload;
            return this;
        }

        public Builder segmentTerminator(Integer segmentTerminator) {
            $.segmentTerminator = segmentTerminator;
            return this;
        }

        public Builder segmentTerminatorSuffix(String segmentTerminatorSuffix) {
            $.segmentTerminatorSuffix = segmentTerminatorSuffix;
            return this;
        }

        public Builder targetNamespace(@Nullable String targetNamespace) {
            $.targetNamespace = targetNamespace;
            return this;
        }

        public X12DelimiterOverridesResponse build() {
            $.componentSeparator = Objects.requireNonNull($.componentSeparator, "expected parameter 'componentSeparator' to be non-null");
            $.dataElementSeparator = Objects.requireNonNull($.dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
            $.replaceCharacter = Objects.requireNonNull($.replaceCharacter, "expected parameter 'replaceCharacter' to be non-null");
            $.replaceSeparatorsInPayload = Objects.requireNonNull($.replaceSeparatorsInPayload, "expected parameter 'replaceSeparatorsInPayload' to be non-null");
            $.segmentTerminator = Objects.requireNonNull($.segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
            $.segmentTerminatorSuffix = Objects.requireNonNull($.segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
            return $;
        }
    }

}
