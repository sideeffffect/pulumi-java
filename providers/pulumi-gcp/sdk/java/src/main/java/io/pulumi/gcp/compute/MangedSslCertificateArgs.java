// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.MangedSslCertificateManagedArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MangedSslCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final MangedSslCertificateArgs Empty = new MangedSslCertificateArgs();

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
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
     * of 'MANAGED' in 'type').
     * 
     */
    @InputImport(name="managed")
      private final @Nullable Input<MangedSslCertificateManagedArgs> managed;

    public Input<MangedSslCertificateManagedArgs> getManaged() {
        return this.managed == null ? Input.empty() : this.managed;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
     * '[a-z]([-a-z0-9]*[a-z0-9])?' which means the first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
     * namespace as the managed SSL certificates.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Enum field whose value is always 'MANAGED' - used to signal to the API which type this is. Default value: "MANAGED"
     * Possible values: ["MANAGED"]
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public MangedSslCertificateArgs(
        @Nullable Input<Integer> certificateId,
        @Nullable Input<String> description,
        @Nullable Input<MangedSslCertificateManagedArgs> managed,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> type) {
        this.certificateId = certificateId;
        this.description = description;
        this.managed = managed;
        this.name = name;
        this.project = project;
        this.type = type;
    }

    private MangedSslCertificateArgs() {
        this.certificateId = Input.empty();
        this.description = Input.empty();
        this.managed = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MangedSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> certificateId;
        private @Nullable Input<String> description;
        private @Nullable Input<MangedSslCertificateManagedArgs> managed;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MangedSslCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.description = defaults.description;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        public Builder certificateId(@Nullable Input<Integer> certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        public Builder certificateId(@Nullable Integer certificateId) {
            this.certificateId = Input.ofNullable(certificateId);
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

        public Builder managed(@Nullable Input<MangedSslCertificateManagedArgs> managed) {
            this.managed = managed;
            return this;
        }

        public Builder managed(@Nullable MangedSslCertificateManagedArgs managed) {
            this.managed = Input.ofNullable(managed);
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

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public MangedSslCertificateArgs build() {
            return new MangedSslCertificateArgs(certificateId, description, managed, name, project, type);
        }
    }
}
