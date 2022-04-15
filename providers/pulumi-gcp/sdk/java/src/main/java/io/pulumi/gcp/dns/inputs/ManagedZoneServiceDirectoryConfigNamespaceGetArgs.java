// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ManagedZoneServiceDirectoryConfigNamespaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigNamespaceGetArgs Empty = new ManagedZoneServiceDirectoryConfigNamespaceGetArgs();

    /**
     * The fully qualified or partial URL of the service directory namespace that should be
     * associated with the zone. This should be formatted like
     * `https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace_id}`
     * or simply `projects/{project}/locations/{location}/namespaces/{namespace_id}`
     * Ignored for `public` visibility zones.
     * 
     */
    @Import(name="namespaceUrl", required=true)
      private final Output<String> namespaceUrl;

    public Output<String> namespaceUrl() {
        return this.namespaceUrl;
    }

    public ManagedZoneServiceDirectoryConfigNamespaceGetArgs(Output<String> namespaceUrl) {
        this.namespaceUrl = Objects.requireNonNull(namespaceUrl, "expected parameter 'namespaceUrl' to be non-null");
    }

    private ManagedZoneServiceDirectoryConfigNamespaceGetArgs() {
        this.namespaceUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigNamespaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> namespaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigNamespaceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceUrl = defaults.namespaceUrl;
        }

        public Builder namespaceUrl(Output<String> namespaceUrl) {
            this.namespaceUrl = Objects.requireNonNull(namespaceUrl);
            return this;
        }
        public Builder namespaceUrl(String namespaceUrl) {
            this.namespaceUrl = Output.of(Objects.requireNonNull(namespaceUrl));
            return this;
        }        public ManagedZoneServiceDirectoryConfigNamespaceGetArgs build() {
            return new ManagedZoneServiceDirectoryConfigNamespaceGetArgs(namespaceUrl);
        }
    }
}
