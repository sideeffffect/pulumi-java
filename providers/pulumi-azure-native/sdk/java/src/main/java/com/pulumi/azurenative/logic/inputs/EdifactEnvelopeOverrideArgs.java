// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact envelope override settings.
 * 
 */
public final class EdifactEnvelopeOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdifactEnvelopeOverrideArgs Empty = new EdifactEnvelopeOverrideArgs();

    /**
     * The application password.
     * 
     */
    @Import(name="applicationPassword")
    private @Nullable Output<String> applicationPassword;

    public Optional<Output<String>> applicationPassword() {
        return Optional.ofNullable(this.applicationPassword);
    }

    /**
     * The association assigned code.
     * 
     */
    @Import(name="associationAssignedCode")
    private @Nullable Output<String> associationAssignedCode;

    public Optional<Output<String>> associationAssignedCode() {
        return Optional.ofNullable(this.associationAssignedCode);
    }

    /**
     * The controlling agency code.
     * 
     */
    @Import(name="controllingAgencyCode")
    private @Nullable Output<String> controllingAgencyCode;

    public Optional<Output<String>> controllingAgencyCode() {
        return Optional.ofNullable(this.controllingAgencyCode);
    }

    /**
     * The functional group id.
     * 
     */
    @Import(name="functionalGroupId")
    private @Nullable Output<String> functionalGroupId;

    public Optional<Output<String>> functionalGroupId() {
        return Optional.ofNullable(this.functionalGroupId);
    }

    /**
     * The group header message release.
     * 
     */
    @Import(name="groupHeaderMessageRelease")
    private @Nullable Output<String> groupHeaderMessageRelease;

    public Optional<Output<String>> groupHeaderMessageRelease() {
        return Optional.ofNullable(this.groupHeaderMessageRelease);
    }

    /**
     * The group header message version.
     * 
     */
    @Import(name="groupHeaderMessageVersion")
    private @Nullable Output<String> groupHeaderMessageVersion;

    public Optional<Output<String>> groupHeaderMessageVersion() {
        return Optional.ofNullable(this.groupHeaderMessageVersion);
    }

    /**
     * The message association assigned code.
     * 
     */
    @Import(name="messageAssociationAssignedCode")
    private @Nullable Output<String> messageAssociationAssignedCode;

    public Optional<Output<String>> messageAssociationAssignedCode() {
        return Optional.ofNullable(this.messageAssociationAssignedCode);
    }

    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    @Import(name="messageId")
    private @Nullable Output<String> messageId;

    public Optional<Output<String>> messageId() {
        return Optional.ofNullable(this.messageId);
    }

    /**
     * The message release version on which this envelope settings has to be applied.
     * 
     */
    @Import(name="messageRelease")
    private @Nullable Output<String> messageRelease;

    public Optional<Output<String>> messageRelease() {
        return Optional.ofNullable(this.messageRelease);
    }

    /**
     * The message version on which this envelope settings has to be applied.
     * 
     */
    @Import(name="messageVersion")
    private @Nullable Output<String> messageVersion;

    public Optional<Output<String>> messageVersion() {
        return Optional.ofNullable(this.messageVersion);
    }

    /**
     * The receiver application id.
     * 
     */
    @Import(name="receiverApplicationId")
    private @Nullable Output<String> receiverApplicationId;

    public Optional<Output<String>> receiverApplicationId() {
        return Optional.ofNullable(this.receiverApplicationId);
    }

    /**
     * The receiver application qualifier.
     * 
     */
    @Import(name="receiverApplicationQualifier")
    private @Nullable Output<String> receiverApplicationQualifier;

    public Optional<Output<String>> receiverApplicationQualifier() {
        return Optional.ofNullable(this.receiverApplicationQualifier);
    }

    /**
     * The sender application id.
     * 
     */
    @Import(name="senderApplicationId")
    private @Nullable Output<String> senderApplicationId;

    public Optional<Output<String>> senderApplicationId() {
        return Optional.ofNullable(this.senderApplicationId);
    }

    /**
     * The sender application qualifier.
     * 
     */
    @Import(name="senderApplicationQualifier")
    private @Nullable Output<String> senderApplicationQualifier;

    public Optional<Output<String>> senderApplicationQualifier() {
        return Optional.ofNullable(this.senderApplicationQualifier);
    }

    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    @Import(name="targetNamespace")
    private @Nullable Output<String> targetNamespace;

    public Optional<Output<String>> targetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }

    private EdifactEnvelopeOverrideArgs() {}

    private EdifactEnvelopeOverrideArgs(EdifactEnvelopeOverrideArgs $) {
        this.applicationPassword = $.applicationPassword;
        this.associationAssignedCode = $.associationAssignedCode;
        this.controllingAgencyCode = $.controllingAgencyCode;
        this.functionalGroupId = $.functionalGroupId;
        this.groupHeaderMessageRelease = $.groupHeaderMessageRelease;
        this.groupHeaderMessageVersion = $.groupHeaderMessageVersion;
        this.messageAssociationAssignedCode = $.messageAssociationAssignedCode;
        this.messageId = $.messageId;
        this.messageRelease = $.messageRelease;
        this.messageVersion = $.messageVersion;
        this.receiverApplicationId = $.receiverApplicationId;
        this.receiverApplicationQualifier = $.receiverApplicationQualifier;
        this.senderApplicationId = $.senderApplicationId;
        this.senderApplicationQualifier = $.senderApplicationQualifier;
        this.targetNamespace = $.targetNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactEnvelopeOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactEnvelopeOverrideArgs $;

        public Builder() {
            $ = new EdifactEnvelopeOverrideArgs();
        }

        public Builder(EdifactEnvelopeOverrideArgs defaults) {
            $ = new EdifactEnvelopeOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationPassword(@Nullable Output<String> applicationPassword) {
            $.applicationPassword = applicationPassword;
            return this;
        }

        public Builder applicationPassword(String applicationPassword) {
            return applicationPassword(Output.of(applicationPassword));
        }

        public Builder associationAssignedCode(@Nullable Output<String> associationAssignedCode) {
            $.associationAssignedCode = associationAssignedCode;
            return this;
        }

        public Builder associationAssignedCode(String associationAssignedCode) {
            return associationAssignedCode(Output.of(associationAssignedCode));
        }

        public Builder controllingAgencyCode(@Nullable Output<String> controllingAgencyCode) {
            $.controllingAgencyCode = controllingAgencyCode;
            return this;
        }

        public Builder controllingAgencyCode(String controllingAgencyCode) {
            return controllingAgencyCode(Output.of(controllingAgencyCode));
        }

        public Builder functionalGroupId(@Nullable Output<String> functionalGroupId) {
            $.functionalGroupId = functionalGroupId;
            return this;
        }

        public Builder functionalGroupId(String functionalGroupId) {
            return functionalGroupId(Output.of(functionalGroupId));
        }

        public Builder groupHeaderMessageRelease(@Nullable Output<String> groupHeaderMessageRelease) {
            $.groupHeaderMessageRelease = groupHeaderMessageRelease;
            return this;
        }

        public Builder groupHeaderMessageRelease(String groupHeaderMessageRelease) {
            return groupHeaderMessageRelease(Output.of(groupHeaderMessageRelease));
        }

        public Builder groupHeaderMessageVersion(@Nullable Output<String> groupHeaderMessageVersion) {
            $.groupHeaderMessageVersion = groupHeaderMessageVersion;
            return this;
        }

        public Builder groupHeaderMessageVersion(String groupHeaderMessageVersion) {
            return groupHeaderMessageVersion(Output.of(groupHeaderMessageVersion));
        }

        public Builder messageAssociationAssignedCode(@Nullable Output<String> messageAssociationAssignedCode) {
            $.messageAssociationAssignedCode = messageAssociationAssignedCode;
            return this;
        }

        public Builder messageAssociationAssignedCode(String messageAssociationAssignedCode) {
            return messageAssociationAssignedCode(Output.of(messageAssociationAssignedCode));
        }

        public Builder messageId(@Nullable Output<String> messageId) {
            $.messageId = messageId;
            return this;
        }

        public Builder messageId(String messageId) {
            return messageId(Output.of(messageId));
        }

        public Builder messageRelease(@Nullable Output<String> messageRelease) {
            $.messageRelease = messageRelease;
            return this;
        }

        public Builder messageRelease(String messageRelease) {
            return messageRelease(Output.of(messageRelease));
        }

        public Builder messageVersion(@Nullable Output<String> messageVersion) {
            $.messageVersion = messageVersion;
            return this;
        }

        public Builder messageVersion(String messageVersion) {
            return messageVersion(Output.of(messageVersion));
        }

        public Builder receiverApplicationId(@Nullable Output<String> receiverApplicationId) {
            $.receiverApplicationId = receiverApplicationId;
            return this;
        }

        public Builder receiverApplicationId(String receiverApplicationId) {
            return receiverApplicationId(Output.of(receiverApplicationId));
        }

        public Builder receiverApplicationQualifier(@Nullable Output<String> receiverApplicationQualifier) {
            $.receiverApplicationQualifier = receiverApplicationQualifier;
            return this;
        }

        public Builder receiverApplicationQualifier(String receiverApplicationQualifier) {
            return receiverApplicationQualifier(Output.of(receiverApplicationQualifier));
        }

        public Builder senderApplicationId(@Nullable Output<String> senderApplicationId) {
            $.senderApplicationId = senderApplicationId;
            return this;
        }

        public Builder senderApplicationId(String senderApplicationId) {
            return senderApplicationId(Output.of(senderApplicationId));
        }

        public Builder senderApplicationQualifier(@Nullable Output<String> senderApplicationQualifier) {
            $.senderApplicationQualifier = senderApplicationQualifier;
            return this;
        }

        public Builder senderApplicationQualifier(String senderApplicationQualifier) {
            return senderApplicationQualifier(Output.of(senderApplicationQualifier));
        }

        public Builder targetNamespace(@Nullable Output<String> targetNamespace) {
            $.targetNamespace = targetNamespace;
            return this;
        }

        public Builder targetNamespace(String targetNamespace) {
            return targetNamespace(Output.of(targetNamespace));
        }

        public EdifactEnvelopeOverrideArgs build() {
            return $;
        }
    }

}
