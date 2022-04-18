// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecVolumeSecret;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceTemplateSpecVolume extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecVolume Empty = new GetServiceTemplateSpecVolume();

    /**
     * The name of the Cloud Run Service.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="secrets", required=true)
      private final List<GetServiceTemplateSpecVolumeSecret> secrets;

    public List<GetServiceTemplateSpecVolumeSecret> secrets() {
        return this.secrets;
    }

    public GetServiceTemplateSpecVolume(
        String name,
        List<GetServiceTemplateSpecVolumeSecret> secrets) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secrets = Objects.requireNonNull(secrets, "expected parameter 'secrets' to be non-null");
    }

    private GetServiceTemplateSpecVolume() {
        this.name = null;
        this.secrets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<GetServiceTemplateSpecVolumeSecret> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secrets = defaults.secrets;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secrets(List<GetServiceTemplateSpecVolumeSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder secrets(GetServiceTemplateSpecVolumeSecret... secrets) {
            return secrets(List.of(secrets));
        }        public GetServiceTemplateSpecVolume build() {
            return new GetServiceTemplateSpecVolume(name, secrets);
        }
    }
}
