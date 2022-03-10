// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewaySmbActiveDirectorySettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewaySmbActiveDirectorySettingsGetArgs Empty = new GatewaySmbActiveDirectorySettingsGetArgs();

    @InputImport(name="activeDirectoryStatus")
      private final @Nullable Input<String> activeDirectoryStatus;

    public Input<String> getActiveDirectoryStatus() {
        return this.activeDirectoryStatus == null ? Input.empty() : this.activeDirectoryStatus;
    }

    /**
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server.
     * If you need to specify the port number include it after the colon (“:”). For example, `mydc.mydomain.com:389`.
     * 
     */
    @InputImport(name="domainControllers")
      private final @Nullable Input<List<String>> domainControllers;

    public Input<List<String>> getDomainControllers() {
        return this.domainControllers == null ? Input.empty() : this.domainControllers;
    }

    /**
     * The name of the domain that you want the gateway to join.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The organizational unit (OU) is a container in an Active Directory that can hold users, groups,
     * computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
     * 
     */
    @InputImport(name="organizationalUnit")
      private final @Nullable Input<String> organizationalUnit;

    public Input<String> getOrganizationalUnit() {
        return this.organizationalUnit == null ? Input.empty() : this.organizationalUnit;
    }

    /**
     * The password of the user who has permission to add the gateway to the Active Directory domain.
     * 
     */
    @InputImport(name="password", required=true)
      private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * Specifies the time in seconds, in which the JoinDomain operation must complete. The default is `20` seconds.
     * 
     */
    @InputImport(name="timeoutInSeconds")
      private final @Nullable Input<Integer> timeoutInSeconds;

    public Input<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Input.empty() : this.timeoutInSeconds;
    }

    /**
     * The user name of user who has permission to add the gateway to the Active Directory domain.
     * 
     */
    @InputImport(name="username", required=true)
      private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public GatewaySmbActiveDirectorySettingsGetArgs(
        @Nullable Input<String> activeDirectoryStatus,
        @Nullable Input<List<String>> domainControllers,
        Input<String> domainName,
        @Nullable Input<String> organizationalUnit,
        Input<String> password,
        @Nullable Input<Integer> timeoutInSeconds,
        Input<String> username) {
        this.activeDirectoryStatus = activeDirectoryStatus;
        this.domainControllers = domainControllers;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.organizationalUnit = organizationalUnit;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.timeoutInSeconds = timeoutInSeconds;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private GatewaySmbActiveDirectorySettingsGetArgs() {
        this.activeDirectoryStatus = Input.empty();
        this.domainControllers = Input.empty();
        this.domainName = Input.empty();
        this.organizationalUnit = Input.empty();
        this.password = Input.empty();
        this.timeoutInSeconds = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaySmbActiveDirectorySettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> activeDirectoryStatus;
        private @Nullable Input<List<String>> domainControllers;
        private Input<String> domainName;
        private @Nullable Input<String> organizationalUnit;
        private Input<String> password;
        private @Nullable Input<Integer> timeoutInSeconds;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewaySmbActiveDirectorySettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryStatus = defaults.activeDirectoryStatus;
    	      this.domainControllers = defaults.domainControllers;
    	      this.domainName = defaults.domainName;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.password = defaults.password;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.username = defaults.username;
        }

        public Builder activeDirectoryStatus(@Nullable Input<String> activeDirectoryStatus) {
            this.activeDirectoryStatus = activeDirectoryStatus;
            return this;
        }

        public Builder activeDirectoryStatus(@Nullable String activeDirectoryStatus) {
            this.activeDirectoryStatus = Input.ofNullable(activeDirectoryStatus);
            return this;
        }

        public Builder domainControllers(@Nullable Input<List<String>> domainControllers) {
            this.domainControllers = domainControllers;
            return this;
        }

        public Builder domainControllers(@Nullable List<String> domainControllers) {
            this.domainControllers = Input.ofNullable(domainControllers);
            return this;
        }

        public Builder domainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder organizationalUnit(@Nullable Input<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Input.ofNullable(organizationalUnit);
            return this;
        }

        public Builder password(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Input<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Input.ofNullable(timeoutInSeconds);
            return this;
        }

        public Builder username(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder username(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public GatewaySmbActiveDirectorySettingsGetArgs build() {
            return new GatewaySmbActiveDirectorySettingsGetArgs(activeDirectoryStatus, domainControllers, domainName, organizationalUnit, password, timeoutInSeconds, username);
        }
    }
}
