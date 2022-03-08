// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigateway_v1.outputs.ApigatewayAuditLogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ApigatewayAuditConfigResponse {
    /**
     * The configuration for logging of each type of permission.
     * 
     */
    private final List<ApigatewayAuditLogConfigResponse> auditLogConfigs;
    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor({"auditLogConfigs","service"})
    private ApigatewayAuditConfigResponse(
        List<ApigatewayAuditLogConfigResponse> auditLogConfigs,
        String service) {
        this.auditLogConfigs = auditLogConfigs;
        this.service = service;
    }

    /**
     * The configuration for logging of each type of permission.
     * 
    */
    public List<ApigatewayAuditLogConfigResponse> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }
    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayAuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApigatewayAuditLogConfigResponse> auditLogConfigs;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayAuditConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder setAuditLogConfigs(List<ApigatewayAuditLogConfigResponse> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public ApigatewayAuditConfigResponse build() {
            return new ApigatewayAuditConfigResponse(auditLogConfigs, service);
        }
    }
}
