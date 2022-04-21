// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql;

import com.pulumi.azurenative.dbforpostgresql.enums.ServerSecurityAlertPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerSecurityAlertPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerSecurityAlertPolicyArgs Empty = new ServerSecurityAlertPolicyArgs();

    /**
     * Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly
     * 
     */
    @Import(name="disabledAlerts")
    private @Nullable Output<List<String>> disabledAlerts;

    public Optional<Output<List<String>>> disabledAlerts() {
        return Optional.ofNullable(this.disabledAlerts);
    }

    /**
     * Specifies that the alert is sent to the account administrators.
     * 
     */
    @Import(name="emailAccountAdmins")
    private @Nullable Output<Boolean> emailAccountAdmins;

    public Optional<Output<Boolean>> emailAccountAdmins() {
        return Optional.ofNullable(this.emailAccountAdmins);
    }

    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    @Import(name="emailAddresses")
    private @Nullable Output<List<String>> emailAddresses;

    public Optional<Output<List<String>>> emailAddresses() {
        return Optional.ofNullable(this.emailAddresses);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    @Import(name="retentionDays")
    private @Nullable Output<Integer> retentionDays;

    public Optional<Output<Integer>> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }

    /**
     * The name of the threat detection policy.
     * 
     */
    @Import(name="securityAlertPolicyName")
    private @Nullable Output<String> securityAlertPolicyName;

    public Optional<Output<String>> securityAlertPolicyName() {
        return Optional.ofNullable(this.securityAlertPolicyName);
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * Specifies the state of the policy, whether it is enabled or disabled.
     * 
     */
    @Import(name="state", required=true)
    private Output<ServerSecurityAlertPolicyState> state;

    public Output<ServerSecurityAlertPolicyState> state() {
        return this.state;
    }

    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    @Import(name="storageAccountAccessKey")
    private @Nullable Output<String> storageAccountAccessKey;

    public Optional<Output<String>> storageAccountAccessKey() {
        return Optional.ofNullable(this.storageAccountAccessKey);
    }

    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    @Import(name="storageEndpoint")
    private @Nullable Output<String> storageEndpoint;

    public Optional<Output<String>> storageEndpoint() {
        return Optional.ofNullable(this.storageEndpoint);
    }

    private ServerSecurityAlertPolicyArgs() {}

    private ServerSecurityAlertPolicyArgs(ServerSecurityAlertPolicyArgs $) {
        this.disabledAlerts = $.disabledAlerts;
        this.emailAccountAdmins = $.emailAccountAdmins;
        this.emailAddresses = $.emailAddresses;
        this.resourceGroupName = $.resourceGroupName;
        this.retentionDays = $.retentionDays;
        this.securityAlertPolicyName = $.securityAlertPolicyName;
        this.serverName = $.serverName;
        this.state = $.state;
        this.storageAccountAccessKey = $.storageAccountAccessKey;
        this.storageEndpoint = $.storageEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerSecurityAlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerSecurityAlertPolicyArgs $;

        public Builder() {
            $ = new ServerSecurityAlertPolicyArgs();
        }

        public Builder(ServerSecurityAlertPolicyArgs defaults) {
            $ = new ServerSecurityAlertPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder disabledAlerts(@Nullable Output<List<String>> disabledAlerts) {
            $.disabledAlerts = disabledAlerts;
            return this;
        }

        public Builder disabledAlerts(List<String> disabledAlerts) {
            return disabledAlerts(Output.of(disabledAlerts));
        }

        public Builder disabledAlerts(String... disabledAlerts) {
            return disabledAlerts(List.of(disabledAlerts));
        }

        public Builder emailAccountAdmins(@Nullable Output<Boolean> emailAccountAdmins) {
            $.emailAccountAdmins = emailAccountAdmins;
            return this;
        }

        public Builder emailAccountAdmins(Boolean emailAccountAdmins) {
            return emailAccountAdmins(Output.of(emailAccountAdmins));
        }

        public Builder emailAddresses(@Nullable Output<List<String>> emailAddresses) {
            $.emailAddresses = emailAddresses;
            return this;
        }

        public Builder emailAddresses(List<String> emailAddresses) {
            return emailAddresses(Output.of(emailAddresses));
        }

        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            $.retentionDays = retentionDays;
            return this;
        }

        public Builder retentionDays(Integer retentionDays) {
            return retentionDays(Output.of(retentionDays));
        }

        public Builder securityAlertPolicyName(@Nullable Output<String> securityAlertPolicyName) {
            $.securityAlertPolicyName = securityAlertPolicyName;
            return this;
        }

        public Builder securityAlertPolicyName(String securityAlertPolicyName) {
            return securityAlertPolicyName(Output.of(securityAlertPolicyName));
        }

        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public Builder state(Output<ServerSecurityAlertPolicyState> state) {
            $.state = state;
            return this;
        }

        public Builder state(ServerSecurityAlertPolicyState state) {
            return state(Output.of(state));
        }

        public Builder storageAccountAccessKey(@Nullable Output<String> storageAccountAccessKey) {
            $.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }

        public Builder storageAccountAccessKey(String storageAccountAccessKey) {
            return storageAccountAccessKey(Output.of(storageAccountAccessKey));
        }

        public Builder storageEndpoint(@Nullable Output<String> storageEndpoint) {
            $.storageEndpoint = storageEndpoint;
            return this;
        }

        public Builder storageEndpoint(String storageEndpoint) {
            return storageEndpoint(Output.of(storageEndpoint));
        }

        public ServerSecurityAlertPolicyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
