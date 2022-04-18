// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class IamAuditConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final IamAuditConfigArgs Empty = new IamAuditConfigArgs();

    /**
     * The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    @Import(name="auditLogConfigs", required=true)
      private final Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs;

    public Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs() {
        return this.auditLogConfigs;
    }

    /**
     * The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    @Import(name="orgId", required=true)
      private final Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_organization\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> service() {
        return this.service;
    }

    public IamAuditConfigArgs(
        Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs,
        Output<String> orgId,
        Output<String> service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private IamAuditConfigArgs() {
        this.auditLogConfigs = Codegen.empty();
        this.orgId = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs;
        private Output<String> orgId;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(IamAuditConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.orgId = defaults.orgId;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }
        public Builder auditLogConfigs(List<IamAuditConfigAuditLogConfigArgs> auditLogConfigs) {
            this.auditLogConfigs = Output.of(Objects.requireNonNull(auditLogConfigs));
            return this;
        }
        public Builder auditLogConfigs(IamAuditConfigAuditLogConfigArgs... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }
        public Builder orgId(Output<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        public Builder orgId(String orgId) {
            this.orgId = Output.of(Objects.requireNonNull(orgId));
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }        public IamAuditConfigArgs build() {
            return new IamAuditConfigArgs(auditLogConfigs, orgId, service);
        }
    }
}
