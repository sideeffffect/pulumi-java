// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SSLCertificateState extends io.pulumi.resources.ResourceArgs {

    public static final SSLCertificateState Empty = new SSLCertificateState();

    /**
     * The certificate in PEM format.
     * The certificate chain must be no greater than 5 certs long.
     * The chain must include at least one intermediate cert.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * The unique identifier for the resource.
     * 
     */
    @InputImport(name="certificateId")
      private final @Nullable Input<Integer> certificateId;

    public Input<Integer> getCertificateId() {
        return this.certificateId == null ? Input.empty() : this.certificateId;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
      private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The write-only private key in PEM format.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="privateKey")
      private final @Nullable Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey == null ? Input.empty() : this.privateKey;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    public SSLCertificateState(
        @Nullable Input<String> certificate,
        @Nullable Input<Integer> certificateId,
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> privateKey,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink) {
        this.certificate = certificate;
        this.certificateId = certificateId;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.name = name;
        this.namePrefix = namePrefix;
        this.privateKey = privateKey;
        this.project = project;
        this.selfLink = selfLink;
    }

    private SSLCertificateState() {
        this.certificate = Input.empty();
        this.certificateId = Input.empty();
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.privateKey = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSLCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;
        private @Nullable Input<Integer> certificateId;
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> privateKey;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(SSLCertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificateId = defaults.certificateId;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.privateKey = defaults.privateKey;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder certificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder certificateId(@Nullable Input<Integer> certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        public Builder certificateId(@Nullable Integer certificateId) {
            this.certificateId = Input.ofNullable(certificateId);
            return this;
        }

        public Builder creationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder namePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder privateKey(@Nullable Input<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Input.ofNullable(privateKey);
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

        public Builder selfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }
        public SSLCertificateState build() {
            return new SSLCertificateState(certificate, certificateId, creationTimestamp, description, name, namePrefix, privateKey, project, selfLink);
        }
    }
}
