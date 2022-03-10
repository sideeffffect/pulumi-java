// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.UserType;
import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The password details.
     * 
     */
    @InputImport(name="encryptedPassword")
      private final @Nullable Input<AsymmetricEncryptedSecretArgs> encryptedPassword;

    public Input<AsymmetricEncryptedSecretArgs> getEncryptedPassword() {
        return this.encryptedPassword == null ? Input.empty() : this.encryptedPassword;
    }

    /**
     * The user name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Type of the user.
     * 
     */
    @InputImport(name="userType", required=true)
      private final Input<Either<String,UserType>> userType;

    public Input<Either<String,UserType>> getUserType() {
        return this.userType;
    }

    public UserArgs(
        Input<String> deviceName,
        @Nullable Input<AsymmetricEncryptedSecretArgs> encryptedPassword,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        Input<Either<String,UserType>> userType) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.encryptedPassword = encryptedPassword;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.userType = Objects.requireNonNull(userType, "expected parameter 'userType' to be non-null");
    }

    private UserArgs() {
        this.deviceName = Input.empty();
        this.encryptedPassword = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.userType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceName;
        private @Nullable Input<AsymmetricEncryptedSecretArgs> encryptedPassword;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private Input<Either<String,UserType>> userType;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.encryptedPassword = defaults.encryptedPassword;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userType = defaults.userType;
        }

        public Builder deviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder encryptedPassword(@Nullable Input<AsymmetricEncryptedSecretArgs> encryptedPassword) {
            this.encryptedPassword = encryptedPassword;
            return this;
        }

        public Builder encryptedPassword(@Nullable AsymmetricEncryptedSecretArgs encryptedPassword) {
            this.encryptedPassword = Input.ofNullable(encryptedPassword);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder userType(Input<Either<String,UserType>> userType) {
            this.userType = Objects.requireNonNull(userType);
            return this;
        }

        public Builder userType(Either<String,UserType> userType) {
            this.userType = Input.of(Objects.requireNonNull(userType));
            return this;
        }
        public UserArgs build() {
            return new UserArgs(deviceName, encryptedPassword, name, resourceGroupName, userType);
        }
    }
}
