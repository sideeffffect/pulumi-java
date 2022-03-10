// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class X12EnvelopeOverrideResponse {
    /**
     * The date format.
     * 
     */
    private final String dateFormat;
    /**
     * The functional identifier code.
     * 
     */
    private final @Nullable String functionalIdentifierCode;
    /**
     * The header version.
     * 
     */
    private final String headerVersion;
    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    private final String messageId;
    /**
     * The protocol version on which this envelope settings has to be applied.
     * 
     */
    private final String protocolVersion;
    /**
     * The receiver application id.
     * 
     */
    private final String receiverApplicationId;
    /**
     * The responsible agency code.
     * 
     */
    private final String responsibleAgencyCode;
    /**
     * The sender application id.
     * 
     */
    private final String senderApplicationId;
    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    private final String targetNamespace;
    /**
     * The time format.
     * 
     */
    private final String timeFormat;

    @OutputCustomType.Constructor
    private X12EnvelopeOverrideResponse(
        @OutputCustomType.Parameter("dateFormat") String dateFormat,
        @OutputCustomType.Parameter("functionalIdentifierCode") @Nullable String functionalIdentifierCode,
        @OutputCustomType.Parameter("headerVersion") String headerVersion,
        @OutputCustomType.Parameter("messageId") String messageId,
        @OutputCustomType.Parameter("protocolVersion") String protocolVersion,
        @OutputCustomType.Parameter("receiverApplicationId") String receiverApplicationId,
        @OutputCustomType.Parameter("responsibleAgencyCode") String responsibleAgencyCode,
        @OutputCustomType.Parameter("senderApplicationId") String senderApplicationId,
        @OutputCustomType.Parameter("targetNamespace") String targetNamespace,
        @OutputCustomType.Parameter("timeFormat") String timeFormat) {
        this.dateFormat = dateFormat;
        this.functionalIdentifierCode = functionalIdentifierCode;
        this.headerVersion = headerVersion;
        this.messageId = messageId;
        this.protocolVersion = protocolVersion;
        this.receiverApplicationId = receiverApplicationId;
        this.responsibleAgencyCode = responsibleAgencyCode;
        this.senderApplicationId = senderApplicationId;
        this.targetNamespace = targetNamespace;
        this.timeFormat = timeFormat;
    }

    /**
     * The date format.
     * 
    */
    public String getDateFormat() {
        return this.dateFormat;
    }
    /**
     * The functional identifier code.
     * 
    */
    public Optional<String> getFunctionalIdentifierCode() {
        return Optional.ofNullable(this.functionalIdentifierCode);
    }
    /**
     * The header version.
     * 
    */
    public String getHeaderVersion() {
        return this.headerVersion;
    }
    /**
     * The message id on which this envelope settings has to be applied.
     * 
    */
    public String getMessageId() {
        return this.messageId;
    }
    /**
     * The protocol version on which this envelope settings has to be applied.
     * 
    */
    public String getProtocolVersion() {
        return this.protocolVersion;
    }
    /**
     * The receiver application id.
     * 
    */
    public String getReceiverApplicationId() {
        return this.receiverApplicationId;
    }
    /**
     * The responsible agency code.
     * 
    */
    public String getResponsibleAgencyCode() {
        return this.responsibleAgencyCode;
    }
    /**
     * The sender application id.
     * 
    */
    public String getSenderApplicationId() {
        return this.senderApplicationId;
    }
    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
    */
    public String getTargetNamespace() {
        return this.targetNamespace;
    }
    /**
     * The time format.
     * 
    */
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12EnvelopeOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dateFormat;
        private @Nullable String functionalIdentifierCode;
        private String headerVersion;
        private String messageId;
        private String protocolVersion;
        private String receiverApplicationId;
        private String responsibleAgencyCode;
        private String senderApplicationId;
        private String targetNamespace;
        private String timeFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(X12EnvelopeOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateFormat = defaults.dateFormat;
    	      this.functionalIdentifierCode = defaults.functionalIdentifierCode;
    	      this.headerVersion = defaults.headerVersion;
    	      this.messageId = defaults.messageId;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.receiverApplicationId = defaults.receiverApplicationId;
    	      this.responsibleAgencyCode = defaults.responsibleAgencyCode;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.targetNamespace = defaults.targetNamespace;
    	      this.timeFormat = defaults.timeFormat;
        }

        public Builder dateFormat(String dateFormat) {
            this.dateFormat = Objects.requireNonNull(dateFormat);
            return this;
        }

        public Builder functionalIdentifierCode(@Nullable String functionalIdentifierCode) {
            this.functionalIdentifierCode = functionalIdentifierCode;
            return this;
        }

        public Builder headerVersion(String headerVersion) {
            this.headerVersion = Objects.requireNonNull(headerVersion);
            return this;
        }

        public Builder messageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder protocolVersion(String protocolVersion) {
            this.protocolVersion = Objects.requireNonNull(protocolVersion);
            return this;
        }

        public Builder receiverApplicationId(String receiverApplicationId) {
            this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId);
            return this;
        }

        public Builder responsibleAgencyCode(String responsibleAgencyCode) {
            this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode);
            return this;
        }

        public Builder senderApplicationId(String senderApplicationId) {
            this.senderApplicationId = Objects.requireNonNull(senderApplicationId);
            return this;
        }

        public Builder targetNamespace(String targetNamespace) {
            this.targetNamespace = Objects.requireNonNull(targetNamespace);
            return this;
        }

        public Builder timeFormat(String timeFormat) {
            this.timeFormat = Objects.requireNonNull(timeFormat);
            return this;
        }
        public X12EnvelopeOverrideResponse build() {
            return new X12EnvelopeOverrideResponse(dateFormat, functionalIdentifierCode, headerVersion, messageId, protocolVersion, receiverApplicationId, responsibleAgencyCode, senderApplicationId, targetNamespace, timeFormat);
        }
    }
}
