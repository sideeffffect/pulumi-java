// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IamAuditConfigState extends io.pulumi.resources.ResourceArgs {

    public static final IamAuditConfigState Empty = new IamAuditConfigState();

    /**
     * The configuration for logging of each type of permission. This can be specified multiple times.
     * 
     */
    @InputImport(name="auditLogConfigs")
      private final @Nullable Input<List<IamAuditConfigAuditLogConfigGetArgs>> auditLogConfigs;

    public Input<List<IamAuditConfigAuditLogConfigGetArgs>> getAuditLogConfigs() {
        return this.auditLogConfigs == null ? Input.empty() : this.auditLogConfigs;
    }

    /**
     * The etag of iam policy
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="folder")
      private final @Nullable Input<String> folder;

    public Input<String> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    /**
     * Service which will be enabled for audit logging. The special value allServices covers all services.
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public IamAuditConfigState(
        @Nullable Input<List<IamAuditConfigAuditLogConfigGetArgs>> auditLogConfigs,
        @Nullable Input<String> etag,
        @Nullable Input<String> folder,
        @Nullable Input<String> service) {
        this.auditLogConfigs = auditLogConfigs;
        this.etag = etag;
        this.folder = folder;
        this.service = service;
    }

    private IamAuditConfigState() {
        this.auditLogConfigs = Input.empty();
        this.etag = Input.empty();
        this.folder = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamAuditConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IamAuditConfigAuditLogConfigGetArgs>> auditLogConfigs;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> folder;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(IamAuditConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(@Nullable Input<List<IamAuditConfigAuditLogConfigGetArgs>> auditLogConfigs) {
            this.auditLogConfigs = auditLogConfigs;
            return this;
        }

        public Builder auditLogConfigs(@Nullable List<IamAuditConfigAuditLogConfigGetArgs> auditLogConfigs) {
            this.auditLogConfigs = Input.ofNullable(auditLogConfigs);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder folder(@Nullable Input<String> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(@Nullable String folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder service(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }
        public IamAuditConfigState build() {
            return new IamAuditConfigState(auditLogConfigs, etag, folder, service);
        }
    }
}
