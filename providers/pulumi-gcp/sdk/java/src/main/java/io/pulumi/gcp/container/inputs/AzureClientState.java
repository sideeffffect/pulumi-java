// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureClientState extends io.pulumi.resources.ResourceArgs {

    public static final AzureClientState Empty = new AzureClientState();

    /**
     * Required. The Azure Active Directory Application ID.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * Output only. The PEM encoded x509 certificate.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Output only. The time at which this resource was created.
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of this resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Required. The Azure Active Directory Tenant ID.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * Output only. A globally unique identifier for the client.
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public AzureClientState(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> certificate,
        @Nullable Input<String> createTime,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> tenantId,
        @Nullable Input<String> uid) {
        this.applicationId = applicationId;
        this.certificate = certificate;
        this.createTime = createTime;
        this.location = location;
        this.name = name;
        this.project = project;
        this.tenantId = tenantId;
        this.uid = uid;
    }

    private AzureClientState() {
        this.applicationId = Input.empty();
        this.certificate = Input.empty();
        this.createTime = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.tenantId = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClientState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> certificate;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClientState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.certificate = defaults.certificate;
    	      this.createTime = defaults.createTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.tenantId = defaults.tenantId;
    	      this.uid = defaults.uid;
        }

        public Builder applicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder certificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder createTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder tenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder uid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder uid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }
        public AzureClientState build() {
            return new AzureClientState(applicationId, certificate, createTime, location, name, project, tenantId, uid);
        }
    }
}
