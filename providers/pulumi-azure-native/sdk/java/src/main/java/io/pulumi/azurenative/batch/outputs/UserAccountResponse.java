// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.LinuxUserConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.WindowsUserConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserAccountResponse {
    /**
     * nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
     */
    private final @Nullable String elevationLevel;
    /**
     * This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     * 
     */
    private final @Nullable LinuxUserConfigurationResponse linuxUserConfiguration;
    private final String name;
    private final String password;
    /**
     * This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
     * 
     */
    private final @Nullable WindowsUserConfigurationResponse windowsUserConfiguration;

    @OutputCustomType.Constructor
    private UserAccountResponse(
        @OutputCustomType.Parameter("elevationLevel") @Nullable String elevationLevel,
        @OutputCustomType.Parameter("linuxUserConfiguration") @Nullable LinuxUserConfigurationResponse linuxUserConfiguration,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("password") String password,
        @OutputCustomType.Parameter("windowsUserConfiguration") @Nullable WindowsUserConfigurationResponse windowsUserConfiguration) {
        this.elevationLevel = elevationLevel;
        this.linuxUserConfiguration = linuxUserConfiguration;
        this.name = name;
        this.password = password;
        this.windowsUserConfiguration = windowsUserConfiguration;
    }

    /**
     * nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
    */
    public Optional<String> getElevationLevel() {
        return Optional.ofNullable(this.elevationLevel);
    }
    /**
     * This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     * 
    */
    public Optional<LinuxUserConfigurationResponse> getLinuxUserConfiguration() {
        return Optional.ofNullable(this.linuxUserConfiguration);
    }
    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }
    /**
     * This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
     * 
    */
    public Optional<WindowsUserConfigurationResponse> getWindowsUserConfiguration() {
        return Optional.ofNullable(this.windowsUserConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String elevationLevel;
        private @Nullable LinuxUserConfigurationResponse linuxUserConfiguration;
        private String name;
        private String password;
        private @Nullable WindowsUserConfigurationResponse windowsUserConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elevationLevel = defaults.elevationLevel;
    	      this.linuxUserConfiguration = defaults.linuxUserConfiguration;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.windowsUserConfiguration = defaults.windowsUserConfiguration;
        }

        public Builder elevationLevel(@Nullable String elevationLevel) {
            this.elevationLevel = elevationLevel;
            return this;
        }

        public Builder linuxUserConfiguration(@Nullable LinuxUserConfigurationResponse linuxUserConfiguration) {
            this.linuxUserConfiguration = linuxUserConfiguration;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder windowsUserConfiguration(@Nullable WindowsUserConfigurationResponse windowsUserConfiguration) {
            this.windowsUserConfiguration = windowsUserConfiguration;
            return this;
        }
        public UserAccountResponse build() {
            return new UserAccountResponse(elevationLevel, linuxUserConfiguration, name, password, windowsUserConfiguration);
        }
    }
}
