// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.SecurityAlertsPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerSecurityAlertPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerSecurityAlertPolicyArgs Empty = new ServerSecurityAlertPolicyArgs();

    /**
     * Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force
     * 
     */
    @Import(name="disabledAlerts")
      private final @Nullable Output<List<String>> disabledAlerts;

    public Output<List<String>> disabledAlerts() {
        return this.disabledAlerts == null ? Codegen.empty() : this.disabledAlerts;
    }

    /**
     * Specifies that the alert is sent to the account administrators.
     * 
     */
    @Import(name="emailAccountAdmins")
      private final @Nullable Output<Boolean> emailAccountAdmins;

    public Output<Boolean> emailAccountAdmins() {
        return this.emailAccountAdmins == null ? Codegen.empty() : this.emailAccountAdmins;
    }

    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    @Import(name="emailAddresses")
      private final @Nullable Output<List<String>> emailAddresses;

    public Output<List<String>> emailAddresses() {
        return this.emailAddresses == null ? Codegen.empty() : this.emailAddresses;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    @Import(name="retentionDays")
      private final @Nullable Output<Integer> retentionDays;

    public Output<Integer> retentionDays() {
        return this.retentionDays == null ? Codegen.empty() : this.retentionDays;
    }

    /**
     * The name of the threat detection policy.
     * 
     */
    @Import(name="securityAlertPolicyName")
      private final @Nullable Output<String> securityAlertPolicyName;

    public Output<String> securityAlertPolicyName() {
        return this.securityAlertPolicyName == null ? Codegen.empty() : this.securityAlertPolicyName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific database.
     * 
     */
    @Import(name="state", required=true)
      private final Output<SecurityAlertsPolicyState> state;

    public Output<SecurityAlertsPolicyState> state() {
        return this.state;
    }

    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    @Import(name="storageAccountAccessKey")
      private final @Nullable Output<String> storageAccountAccessKey;

    public Output<String> storageAccountAccessKey() {
        return this.storageAccountAccessKey == null ? Codegen.empty() : this.storageAccountAccessKey;
    }

    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    @Import(name="storageEndpoint")
      private final @Nullable Output<String> storageEndpoint;

    public Output<String> storageEndpoint() {
        return this.storageEndpoint == null ? Codegen.empty() : this.storageEndpoint;
    }

    public ServerSecurityAlertPolicyArgs(
        @Nullable Output<List<String>> disabledAlerts,
        @Nullable Output<Boolean> emailAccountAdmins,
        @Nullable Output<List<String>> emailAddresses,
        Output<String> resourceGroupName,
        @Nullable Output<Integer> retentionDays,
        @Nullable Output<String> securityAlertPolicyName,
        Output<String> serverName,
        Output<SecurityAlertsPolicyState> state,
        @Nullable Output<String> storageAccountAccessKey,
        @Nullable Output<String> storageEndpoint) {
        this.disabledAlerts = disabledAlerts;
        this.emailAccountAdmins = emailAccountAdmins;
        this.emailAddresses = emailAddresses;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retentionDays = retentionDays;
        this.securityAlertPolicyName = securityAlertPolicyName;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.storageAccountAccessKey = storageAccountAccessKey;
        this.storageEndpoint = storageEndpoint;
    }

    private ServerSecurityAlertPolicyArgs() {
        this.disabledAlerts = Codegen.empty();
        this.emailAccountAdmins = Codegen.empty();
        this.emailAddresses = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.retentionDays = Codegen.empty();
        this.securityAlertPolicyName = Codegen.empty();
        this.serverName = Codegen.empty();
        this.state = Codegen.empty();
        this.storageAccountAccessKey = Codegen.empty();
        this.storageEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerSecurityAlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> disabledAlerts;
        private @Nullable Output<Boolean> emailAccountAdmins;
        private @Nullable Output<List<String>> emailAddresses;
        private Output<String> resourceGroupName;
        private @Nullable Output<Integer> retentionDays;
        private @Nullable Output<String> securityAlertPolicyName;
        private Output<String> serverName;
        private Output<SecurityAlertsPolicyState> state;
        private @Nullable Output<String> storageAccountAccessKey;
        private @Nullable Output<String> storageEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerSecurityAlertPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledAlerts = defaults.disabledAlerts;
    	      this.emailAccountAdmins = defaults.emailAccountAdmins;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionDays = defaults.retentionDays;
    	      this.securityAlertPolicyName = defaults.securityAlertPolicyName;
    	      this.serverName = defaults.serverName;
    	      this.state = defaults.state;
    	      this.storageAccountAccessKey = defaults.storageAccountAccessKey;
    	      this.storageEndpoint = defaults.storageEndpoint;
        }

        public Builder disabledAlerts(@Nullable Output<List<String>> disabledAlerts) {
            this.disabledAlerts = disabledAlerts;
            return this;
        }
        public Builder disabledAlerts(@Nullable List<String> disabledAlerts) {
            this.disabledAlerts = Codegen.ofNullable(disabledAlerts);
            return this;
        }
        public Builder disabledAlerts(String... disabledAlerts) {
            return disabledAlerts(List.of(disabledAlerts));
        }
        public Builder emailAccountAdmins(@Nullable Output<Boolean> emailAccountAdmins) {
            this.emailAccountAdmins = emailAccountAdmins;
            return this;
        }
        public Builder emailAccountAdmins(@Nullable Boolean emailAccountAdmins) {
            this.emailAccountAdmins = Codegen.ofNullable(emailAccountAdmins);
            return this;
        }
        public Builder emailAddresses(@Nullable Output<List<String>> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }
        public Builder emailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = Codegen.ofNullable(emailAddresses);
            return this;
        }
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Codegen.ofNullable(retentionDays);
            return this;
        }
        public Builder securityAlertPolicyName(@Nullable Output<String> securityAlertPolicyName) {
            this.securityAlertPolicyName = securityAlertPolicyName;
            return this;
        }
        public Builder securityAlertPolicyName(@Nullable String securityAlertPolicyName) {
            this.securityAlertPolicyName = Codegen.ofNullable(securityAlertPolicyName);
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder state(Output<SecurityAlertsPolicyState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder state(SecurityAlertsPolicyState state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }
        public Builder storageAccountAccessKey(@Nullable Output<String> storageAccountAccessKey) {
            this.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }
        public Builder storageAccountAccessKey(@Nullable String storageAccountAccessKey) {
            this.storageAccountAccessKey = Codegen.ofNullable(storageAccountAccessKey);
            return this;
        }
        public Builder storageEndpoint(@Nullable Output<String> storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }
        public Builder storageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = Codegen.ofNullable(storageEndpoint);
            return this;
        }        public ServerSecurityAlertPolicyArgs build() {
            return new ServerSecurityAlertPolicyArgs(disabledAlerts, emailAccountAdmins, emailAddresses, resourceGroupName, retentionDays, securityAlertPolicyName, serverName, state, storageAccountAccessKey, storageEndpoint);
        }
    }
}
