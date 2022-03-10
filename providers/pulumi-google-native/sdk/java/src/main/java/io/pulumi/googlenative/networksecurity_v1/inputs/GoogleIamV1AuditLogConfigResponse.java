// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Provides the configuration for logging a type of permissions. Example: { "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ] }, { "log_type": "DATA_WRITE" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class GoogleIamV1AuditLogConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleIamV1AuditLogConfigResponse Empty = new GoogleIamV1AuditLogConfigResponse();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @InputImport(name="exemptedMembers", required=true)
      private final List<String> exemptedMembers;

    public List<String> getExemptedMembers() {
        return this.exemptedMembers;
    }

    /**
     * The log type that this config enables.
     * 
     */
    @InputImport(name="logType", required=true)
      private final String logType;

    public String getLogType() {
        return this.logType;
    }

    public GoogleIamV1AuditLogConfigResponse(
        List<String> exemptedMembers,
        String logType) {
        this.exemptedMembers = Objects.requireNonNull(exemptedMembers, "expected parameter 'exemptedMembers' to be non-null");
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private GoogleIamV1AuditLogConfigResponse() {
        this.exemptedMembers = List.of();
        this.logType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleIamV1AuditLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleIamV1AuditLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder exemptedMembers(List<String> exemptedMembers) {
            this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
            return this;
        }

        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public GoogleIamV1AuditLogConfigResponse build() {
            return new GoogleIamV1AuditLogConfigResponse(exemptedMembers, logType);
        }
    }
}
