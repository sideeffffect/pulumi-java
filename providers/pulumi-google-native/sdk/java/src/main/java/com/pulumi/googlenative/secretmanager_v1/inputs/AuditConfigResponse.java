// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.secretmanager_v1.inputs.AuditLogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies the audit configuration for a service. The configuration determines which permission types are logged, and what identities, if any, are exempted from logging. An AuditConfig must have one or more AuditLogConfigs. If there are AuditConfigs for both `allServices` and a specific service, the union of the two AuditConfigs is used for that service: the log_types specified in each AuditConfig are enabled, and the exempted_members in each AuditLogConfig are exempted. Example Policy with multiple AuditConfigs: { &#34;audit_configs&#34;: [ { &#34;service&#34;: &#34;allServices&#34;, &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34;, &#34;exempted_members&#34;: [ &#34;user:jose@example.com&#34; ] }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34; }, { &#34;log_type&#34;: &#34;ADMIN_READ&#34; } ] }, { &#34;service&#34;: &#34;sampleservice.googleapis.com&#34;, &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34; }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34;, &#34;exempted_members&#34;: [ &#34;user:aliya@example.com&#34; ] } ] } ] } For sampleservice, this policy enables DATA_READ, DATA_WRITE and ADMIN_READ logging. It also exempts jose@example.com from DATA_READ logging, and aliya@example.com from DATA_WRITE logging.
 * 
 */
public final class AuditConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuditConfigResponse Empty = new AuditConfigResponse();

    /**
     * The configuration for logging of each type of permission.
     * 
     */
    @Import(name="auditLogConfigs", required=true)
    private List<AuditLogConfigResponse> auditLogConfigs;

    public List<AuditLogConfigResponse> auditLogConfigs() {
        return this.auditLogConfigs;
    }

    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    @Import(name="service", required=true)
    private String service;

    public String service() {
        return this.service;
    }

    private AuditConfigResponse() {}

    private AuditConfigResponse(AuditConfigResponse $) {
        this.auditLogConfigs = $.auditLogConfigs;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuditConfigResponse $;

        public Builder() {
            $ = new AuditConfigResponse();
        }

        public Builder(AuditConfigResponse defaults) {
            $ = new AuditConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder auditLogConfigs(List<AuditLogConfigResponse> auditLogConfigs) {
            $.auditLogConfigs = auditLogConfigs;
            return this;
        }

        public Builder auditLogConfigs(AuditLogConfigResponse... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }

        public Builder service(String service) {
            $.service = service;
            return this;
        }

        public AuditConfigResponse build() {
            $.auditLogConfigs = Objects.requireNonNull($.auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
