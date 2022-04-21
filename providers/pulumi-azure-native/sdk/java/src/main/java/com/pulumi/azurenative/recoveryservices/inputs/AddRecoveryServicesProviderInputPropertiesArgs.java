// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.IdentityProviderInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of an add provider request.
 * 
 */
public final class AddRecoveryServicesProviderInputPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AddRecoveryServicesProviderInputPropertiesArgs Empty = new AddRecoveryServicesProviderInputPropertiesArgs();

    /**
     * The identity provider input for DRA authentication.
     * 
     */
    @Import(name="authenticationIdentityInput", required=true)
    private Output<IdentityProviderInputArgs> authenticationIdentityInput;

    public Output<IdentityProviderInputArgs> authenticationIdentityInput() {
        return this.authenticationIdentityInput;
    }

    /**
     * The identity provider input for data plane authentication.
     * 
     */
    @Import(name="dataPlaneAuthenticationIdentityInput")
    private @Nullable Output<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput;

    public Optional<Output<IdentityProviderInputArgs>> dataPlaneAuthenticationIdentityInput() {
        return Optional.ofNullable(this.dataPlaneAuthenticationIdentityInput);
    }

    /**
     * The Id of the machine where the provider is getting added.
     * 
     */
    @Import(name="machineId")
    private @Nullable Output<String> machineId;

    public Optional<Output<String>> machineId() {
        return Optional.ofNullable(this.machineId);
    }

    /**
     * The name of the machine where the provider is getting added.
     * 
     */
    @Import(name="machineName", required=true)
    private Output<String> machineName;

    public Output<String> machineName() {
        return this.machineName;
    }

    /**
     * The identity provider input for resource access.
     * 
     */
    @Import(name="resourceAccessIdentityInput", required=true)
    private Output<IdentityProviderInputArgs> resourceAccessIdentityInput;

    public Output<IdentityProviderInputArgs> resourceAccessIdentityInput() {
        return this.resourceAccessIdentityInput;
    }

    private AddRecoveryServicesProviderInputPropertiesArgs() {}

    private AddRecoveryServicesProviderInputPropertiesArgs(AddRecoveryServicesProviderInputPropertiesArgs $) {
        this.authenticationIdentityInput = $.authenticationIdentityInput;
        this.dataPlaneAuthenticationIdentityInput = $.dataPlaneAuthenticationIdentityInput;
        this.machineId = $.machineId;
        this.machineName = $.machineName;
        this.resourceAccessIdentityInput = $.resourceAccessIdentityInput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddRecoveryServicesProviderInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddRecoveryServicesProviderInputPropertiesArgs $;

        public Builder() {
            $ = new AddRecoveryServicesProviderInputPropertiesArgs();
        }

        public Builder(AddRecoveryServicesProviderInputPropertiesArgs defaults) {
            $ = new AddRecoveryServicesProviderInputPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationIdentityInput(Output<IdentityProviderInputArgs> authenticationIdentityInput) {
            $.authenticationIdentityInput = authenticationIdentityInput;
            return this;
        }

        public Builder authenticationIdentityInput(IdentityProviderInputArgs authenticationIdentityInput) {
            return authenticationIdentityInput(Output.of(authenticationIdentityInput));
        }

        public Builder dataPlaneAuthenticationIdentityInput(@Nullable Output<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput) {
            $.dataPlaneAuthenticationIdentityInput = dataPlaneAuthenticationIdentityInput;
            return this;
        }

        public Builder dataPlaneAuthenticationIdentityInput(IdentityProviderInputArgs dataPlaneAuthenticationIdentityInput) {
            return dataPlaneAuthenticationIdentityInput(Output.of(dataPlaneAuthenticationIdentityInput));
        }

        public Builder machineId(@Nullable Output<String> machineId) {
            $.machineId = machineId;
            return this;
        }

        public Builder machineId(String machineId) {
            return machineId(Output.of(machineId));
        }

        public Builder machineName(Output<String> machineName) {
            $.machineName = machineName;
            return this;
        }

        public Builder machineName(String machineName) {
            return machineName(Output.of(machineName));
        }

        public Builder resourceAccessIdentityInput(Output<IdentityProviderInputArgs> resourceAccessIdentityInput) {
            $.resourceAccessIdentityInput = resourceAccessIdentityInput;
            return this;
        }

        public Builder resourceAccessIdentityInput(IdentityProviderInputArgs resourceAccessIdentityInput) {
            return resourceAccessIdentityInput(Output.of(resourceAccessIdentityInput));
        }

        public AddRecoveryServicesProviderInputPropertiesArgs build() {
            $.authenticationIdentityInput = Objects.requireNonNull($.authenticationIdentityInput, "expected parameter 'authenticationIdentityInput' to be non-null");
            $.machineName = Objects.requireNonNull($.machineName, "expected parameter 'machineName' to be non-null");
            $.resourceAccessIdentityInput = Objects.requireNonNull($.resourceAccessIdentityInput, "expected parameter 'resourceAccessIdentityInput' to be non-null");
            return $;
        }
    }

}
