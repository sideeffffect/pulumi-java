// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigAuditLogConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetIAMPolicyAuditConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetIAMPolicyAuditConfig Empty = new GetIAMPolicyAuditConfig();

    /**
     * A nested block that defines the operations you'd like to log.
     * 
     */
    @Import(name="auditLogConfigs", required=true)
      private final List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs;

    public List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs() {
        return this.auditLogConfigs;
    }

    /**
     * Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    @Import(name="service", required=true)
      private final String service;

    public String service() {
        return this.service;
    }

    public GetIAMPolicyAuditConfig(
        List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs,
        String service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private GetIAMPolicyAuditConfig() {
        this.auditLogConfigs = List.of();
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyAuditConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyAuditConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }
        public Builder auditLogConfigs(GetIAMPolicyAuditConfigAuditLogConfig... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public GetIAMPolicyAuditConfig build() {
            return new GetIAMPolicyAuditConfig(auditLogConfigs, service);
        }
    }
}
