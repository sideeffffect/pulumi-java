// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration.inputs;

import com.pulumi.azurenative.guestconfiguration.enums.AssignmentType;
import com.pulumi.azurenative.guestconfiguration.enums.Kind;
import com.pulumi.azurenative.guestconfiguration.inputs.ConfigurationParameterArgs;
import com.pulumi.azurenative.guestconfiguration.inputs.ConfigurationSettingArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Guest configuration is an artifact that encapsulates DSC configuration and its dependencies. The artifact is a zip file containing DSC configuration (as MOF) and dependent resources and other dependencies like modules.
 * 
 */
public final class GuestConfigurationNavigationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestConfigurationNavigationArgs Empty = new GuestConfigurationNavigationArgs();

    /**
     * Specifies the assignment type and execution of the configuration. Possible values are Audit, DeployAndAutoCorrect, ApplyAndAutoCorrect and ApplyAndMonitor.
     * 
     */
    @Import(name="assignmentType")
    private @Nullable Output<Either<String,AssignmentType>> assignmentType;

    public Optional<Output<Either<String,AssignmentType>>> assignmentType() {
        return Optional.ofNullable(this.assignmentType);
    }

    /**
     * The configuration parameters for the guest configuration.
     * 
     */
    @Import(name="configurationParameter")
    private @Nullable Output<List<ConfigurationParameterArgs>> configurationParameter;

    public Optional<Output<List<ConfigurationParameterArgs>>> configurationParameter() {
        return Optional.ofNullable(this.configurationParameter);
    }

    /**
     * The protected configuration parameters for the guest configuration.
     * 
     */
    @Import(name="configurationProtectedParameter")
    private @Nullable Output<List<ConfigurationParameterArgs>> configurationProtectedParameter;

    public Optional<Output<List<ConfigurationParameterArgs>>> configurationProtectedParameter() {
        return Optional.ofNullable(this.configurationProtectedParameter);
    }

    /**
     * The configuration setting for the guest configuration.
     * 
     */
    @Import(name="configurationSetting")
    private @Nullable Output<ConfigurationSettingArgs> configurationSetting;

    public Optional<Output<ConfigurationSettingArgs>> configurationSetting() {
        return Optional.ofNullable(this.configurationSetting);
    }

    /**
     * Combined hash of the guest configuration package and configuration parameters.
     * 
     */
    @Import(name="contentHash")
    private @Nullable Output<String> contentHash;

    public Optional<Output<String>> contentHash() {
        return Optional.ofNullable(this.contentHash);
    }

    /**
     * Uri of the storage where guest configuration package is uploaded.
     * 
     */
    @Import(name="contentUri")
    private @Nullable Output<String> contentUri;

    public Optional<Output<String>> contentUri() {
        return Optional.ofNullable(this.contentUri);
    }

    /**
     * Kind of the guest configuration. For example:DSC
     * 
     */
    @Import(name="kind")
    private @Nullable Output<Either<String,Kind>> kind;

    public Optional<Output<Either<String,Kind>>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the guest configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Version of the guest configuration.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GuestConfigurationNavigationArgs() {}

    private GuestConfigurationNavigationArgs(GuestConfigurationNavigationArgs $) {
        this.assignmentType = $.assignmentType;
        this.configurationParameter = $.configurationParameter;
        this.configurationProtectedParameter = $.configurationProtectedParameter;
        this.configurationSetting = $.configurationSetting;
        this.contentHash = $.contentHash;
        this.contentUri = $.contentUri;
        this.kind = $.kind;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestConfigurationNavigationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestConfigurationNavigationArgs $;

        public Builder() {
            $ = new GuestConfigurationNavigationArgs();
        }

        public Builder(GuestConfigurationNavigationArgs defaults) {
            $ = new GuestConfigurationNavigationArgs(Objects.requireNonNull(defaults));
        }

        public Builder assignmentType(@Nullable Output<Either<String,AssignmentType>> assignmentType) {
            $.assignmentType = assignmentType;
            return this;
        }

        public Builder assignmentType(Either<String,AssignmentType> assignmentType) {
            return assignmentType(Output.of(assignmentType));
        }

        public Builder configurationParameter(@Nullable Output<List<ConfigurationParameterArgs>> configurationParameter) {
            $.configurationParameter = configurationParameter;
            return this;
        }

        public Builder configurationParameter(List<ConfigurationParameterArgs> configurationParameter) {
            return configurationParameter(Output.of(configurationParameter));
        }

        public Builder configurationParameter(ConfigurationParameterArgs... configurationParameter) {
            return configurationParameter(List.of(configurationParameter));
        }

        public Builder configurationProtectedParameter(@Nullable Output<List<ConfigurationParameterArgs>> configurationProtectedParameter) {
            $.configurationProtectedParameter = configurationProtectedParameter;
            return this;
        }

        public Builder configurationProtectedParameter(List<ConfigurationParameterArgs> configurationProtectedParameter) {
            return configurationProtectedParameter(Output.of(configurationProtectedParameter));
        }

        public Builder configurationProtectedParameter(ConfigurationParameterArgs... configurationProtectedParameter) {
            return configurationProtectedParameter(List.of(configurationProtectedParameter));
        }

        public Builder configurationSetting(@Nullable Output<ConfigurationSettingArgs> configurationSetting) {
            $.configurationSetting = configurationSetting;
            return this;
        }

        public Builder configurationSetting(ConfigurationSettingArgs configurationSetting) {
            return configurationSetting(Output.of(configurationSetting));
        }

        public Builder contentHash(@Nullable Output<String> contentHash) {
            $.contentHash = contentHash;
            return this;
        }

        public Builder contentHash(String contentHash) {
            return contentHash(Output.of(contentHash));
        }

        public Builder contentUri(@Nullable Output<String> contentUri) {
            $.contentUri = contentUri;
            return this;
        }

        public Builder contentUri(String contentUri) {
            return contentUri(Output.of(contentUri));
        }

        public Builder kind(@Nullable Output<Either<String,Kind>> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(Either<String,Kind> kind) {
            return kind(Output.of(kind));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GuestConfigurationNavigationArgs build() {
            return $;
        }
    }

}
