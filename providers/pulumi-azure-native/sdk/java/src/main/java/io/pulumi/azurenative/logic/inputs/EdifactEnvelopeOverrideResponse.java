// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact envelope override settings.
 * 
 */
public final class EdifactEnvelopeOverrideResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdifactEnvelopeOverrideResponse Empty = new EdifactEnvelopeOverrideResponse();

    /**
     * The application password.
     * 
     */
    @InputImport(name="applicationPassword")
      private final @Nullable String applicationPassword;

    public Optional<String> getApplicationPassword() {
        return this.applicationPassword == null ? Optional.empty() : Optional.ofNullable(this.applicationPassword);
    }

    /**
     * The association assigned code.
     * 
     */
    @InputImport(name="associationAssignedCode")
      private final @Nullable String associationAssignedCode;

    public Optional<String> getAssociationAssignedCode() {
        return this.associationAssignedCode == null ? Optional.empty() : Optional.ofNullable(this.associationAssignedCode);
    }

    /**
     * The controlling agency code.
     * 
     */
    @InputImport(name="controllingAgencyCode")
      private final @Nullable String controllingAgencyCode;

    public Optional<String> getControllingAgencyCode() {
        return this.controllingAgencyCode == null ? Optional.empty() : Optional.ofNullable(this.controllingAgencyCode);
    }

    /**
     * The functional group id.
     * 
     */
    @InputImport(name="functionalGroupId")
      private final @Nullable String functionalGroupId;

    public Optional<String> getFunctionalGroupId() {
        return this.functionalGroupId == null ? Optional.empty() : Optional.ofNullable(this.functionalGroupId);
    }

    /**
     * The group header message release.
     * 
     */
    @InputImport(name="groupHeaderMessageRelease")
      private final @Nullable String groupHeaderMessageRelease;

    public Optional<String> getGroupHeaderMessageRelease() {
        return this.groupHeaderMessageRelease == null ? Optional.empty() : Optional.ofNullable(this.groupHeaderMessageRelease);
    }

    /**
     * The group header message version.
     * 
     */
    @InputImport(name="groupHeaderMessageVersion")
      private final @Nullable String groupHeaderMessageVersion;

    public Optional<String> getGroupHeaderMessageVersion() {
        return this.groupHeaderMessageVersion == null ? Optional.empty() : Optional.ofNullable(this.groupHeaderMessageVersion);
    }

    /**
     * The message association assigned code.
     * 
     */
    @InputImport(name="messageAssociationAssignedCode")
      private final @Nullable String messageAssociationAssignedCode;

    public Optional<String> getMessageAssociationAssignedCode() {
        return this.messageAssociationAssignedCode == null ? Optional.empty() : Optional.ofNullable(this.messageAssociationAssignedCode);
    }

    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    @InputImport(name="messageId")
      private final @Nullable String messageId;

    public Optional<String> getMessageId() {
        return this.messageId == null ? Optional.empty() : Optional.ofNullable(this.messageId);
    }

    /**
     * The message release version on which this envelope settings has to be applied.
     * 
     */
    @InputImport(name="messageRelease")
      private final @Nullable String messageRelease;

    public Optional<String> getMessageRelease() {
        return this.messageRelease == null ? Optional.empty() : Optional.ofNullable(this.messageRelease);
    }

    /**
     * The message version on which this envelope settings has to be applied.
     * 
     */
    @InputImport(name="messageVersion")
      private final @Nullable String messageVersion;

    public Optional<String> getMessageVersion() {
        return this.messageVersion == null ? Optional.empty() : Optional.ofNullable(this.messageVersion);
    }

    /**
     * The receiver application id.
     * 
     */
    @InputImport(name="receiverApplicationId")
      private final @Nullable String receiverApplicationId;

    public Optional<String> getReceiverApplicationId() {
        return this.receiverApplicationId == null ? Optional.empty() : Optional.ofNullable(this.receiverApplicationId);
    }

    /**
     * The receiver application qualifier.
     * 
     */
    @InputImport(name="receiverApplicationQualifier")
      private final @Nullable String receiverApplicationQualifier;

    public Optional<String> getReceiverApplicationQualifier() {
        return this.receiverApplicationQualifier == null ? Optional.empty() : Optional.ofNullable(this.receiverApplicationQualifier);
    }

    /**
     * The sender application id.
     * 
     */
    @InputImport(name="senderApplicationId")
      private final @Nullable String senderApplicationId;

    public Optional<String> getSenderApplicationId() {
        return this.senderApplicationId == null ? Optional.empty() : Optional.ofNullable(this.senderApplicationId);
    }

    /**
     * The sender application qualifier.
     * 
     */
    @InputImport(name="senderApplicationQualifier")
      private final @Nullable String senderApplicationQualifier;

    public Optional<String> getSenderApplicationQualifier() {
        return this.senderApplicationQualifier == null ? Optional.empty() : Optional.ofNullable(this.senderApplicationQualifier);
    }

    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    @InputImport(name="targetNamespace")
      private final @Nullable String targetNamespace;

    public Optional<String> getTargetNamespace() {
        return this.targetNamespace == null ? Optional.empty() : Optional.ofNullable(this.targetNamespace);
    }

    public EdifactEnvelopeOverrideResponse(
        @Nullable String applicationPassword,
        @Nullable String associationAssignedCode,
        @Nullable String controllingAgencyCode,
        @Nullable String functionalGroupId,
        @Nullable String groupHeaderMessageRelease,
        @Nullable String groupHeaderMessageVersion,
        @Nullable String messageAssociationAssignedCode,
        @Nullable String messageId,
        @Nullable String messageRelease,
        @Nullable String messageVersion,
        @Nullable String receiverApplicationId,
        @Nullable String receiverApplicationQualifier,
        @Nullable String senderApplicationId,
        @Nullable String senderApplicationQualifier,
        @Nullable String targetNamespace) {
        this.applicationPassword = applicationPassword;
        this.associationAssignedCode = associationAssignedCode;
        this.controllingAgencyCode = controllingAgencyCode;
        this.functionalGroupId = functionalGroupId;
        this.groupHeaderMessageRelease = groupHeaderMessageRelease;
        this.groupHeaderMessageVersion = groupHeaderMessageVersion;
        this.messageAssociationAssignedCode = messageAssociationAssignedCode;
        this.messageId = messageId;
        this.messageRelease = messageRelease;
        this.messageVersion = messageVersion;
        this.receiverApplicationId = receiverApplicationId;
        this.receiverApplicationQualifier = receiverApplicationQualifier;
        this.senderApplicationId = senderApplicationId;
        this.senderApplicationQualifier = senderApplicationQualifier;
        this.targetNamespace = targetNamespace;
    }

    private EdifactEnvelopeOverrideResponse() {
        this.applicationPassword = null;
        this.associationAssignedCode = null;
        this.controllingAgencyCode = null;
        this.functionalGroupId = null;
        this.groupHeaderMessageRelease = null;
        this.groupHeaderMessageVersion = null;
        this.messageAssociationAssignedCode = null;
        this.messageId = null;
        this.messageRelease = null;
        this.messageVersion = null;
        this.receiverApplicationId = null;
        this.receiverApplicationQualifier = null;
        this.senderApplicationId = null;
        this.senderApplicationQualifier = null;
        this.targetNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactEnvelopeOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationPassword;
        private @Nullable String associationAssignedCode;
        private @Nullable String controllingAgencyCode;
        private @Nullable String functionalGroupId;
        private @Nullable String groupHeaderMessageRelease;
        private @Nullable String groupHeaderMessageVersion;
        private @Nullable String messageAssociationAssignedCode;
        private @Nullable String messageId;
        private @Nullable String messageRelease;
        private @Nullable String messageVersion;
        private @Nullable String receiverApplicationId;
        private @Nullable String receiverApplicationQualifier;
        private @Nullable String senderApplicationId;
        private @Nullable String senderApplicationQualifier;
        private @Nullable String targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactEnvelopeOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationPassword = defaults.applicationPassword;
    	      this.associationAssignedCode = defaults.associationAssignedCode;
    	      this.controllingAgencyCode = defaults.controllingAgencyCode;
    	      this.functionalGroupId = defaults.functionalGroupId;
    	      this.groupHeaderMessageRelease = defaults.groupHeaderMessageRelease;
    	      this.groupHeaderMessageVersion = defaults.groupHeaderMessageVersion;
    	      this.messageAssociationAssignedCode = defaults.messageAssociationAssignedCode;
    	      this.messageId = defaults.messageId;
    	      this.messageRelease = defaults.messageRelease;
    	      this.messageVersion = defaults.messageVersion;
    	      this.receiverApplicationId = defaults.receiverApplicationId;
    	      this.receiverApplicationQualifier = defaults.receiverApplicationQualifier;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.senderApplicationQualifier = defaults.senderApplicationQualifier;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder applicationPassword(@Nullable String applicationPassword) {
            this.applicationPassword = applicationPassword;
            return this;
        }

        public Builder associationAssignedCode(@Nullable String associationAssignedCode) {
            this.associationAssignedCode = associationAssignedCode;
            return this;
        }

        public Builder controllingAgencyCode(@Nullable String controllingAgencyCode) {
            this.controllingAgencyCode = controllingAgencyCode;
            return this;
        }

        public Builder functionalGroupId(@Nullable String functionalGroupId) {
            this.functionalGroupId = functionalGroupId;
            return this;
        }

        public Builder groupHeaderMessageRelease(@Nullable String groupHeaderMessageRelease) {
            this.groupHeaderMessageRelease = groupHeaderMessageRelease;
            return this;
        }

        public Builder groupHeaderMessageVersion(@Nullable String groupHeaderMessageVersion) {
            this.groupHeaderMessageVersion = groupHeaderMessageVersion;
            return this;
        }

        public Builder messageAssociationAssignedCode(@Nullable String messageAssociationAssignedCode) {
            this.messageAssociationAssignedCode = messageAssociationAssignedCode;
            return this;
        }

        public Builder messageId(@Nullable String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder messageRelease(@Nullable String messageRelease) {
            this.messageRelease = messageRelease;
            return this;
        }

        public Builder messageVersion(@Nullable String messageVersion) {
            this.messageVersion = messageVersion;
            return this;
        }

        public Builder receiverApplicationId(@Nullable String receiverApplicationId) {
            this.receiverApplicationId = receiverApplicationId;
            return this;
        }

        public Builder receiverApplicationQualifier(@Nullable String receiverApplicationQualifier) {
            this.receiverApplicationQualifier = receiverApplicationQualifier;
            return this;
        }

        public Builder senderApplicationId(@Nullable String senderApplicationId) {
            this.senderApplicationId = senderApplicationId;
            return this;
        }

        public Builder senderApplicationQualifier(@Nullable String senderApplicationQualifier) {
            this.senderApplicationQualifier = senderApplicationQualifier;
            return this;
        }

        public Builder targetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public EdifactEnvelopeOverrideResponse build() {
            return new EdifactEnvelopeOverrideResponse(applicationPassword, associationAssignedCode, controllingAgencyCode, functionalGroupId, groupHeaderMessageRelease, groupHeaderMessageVersion, messageAssociationAssignedCode, messageId, messageRelease, messageVersion, receiverApplicationId, receiverApplicationQualifier, senderApplicationId, senderApplicationQualifier, targetNamespace);
        }
    }
}
