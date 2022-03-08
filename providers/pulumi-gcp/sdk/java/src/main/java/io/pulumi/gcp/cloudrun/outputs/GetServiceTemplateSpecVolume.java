// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecVolumeSecret;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServiceTemplateSpecVolume {
    /**
     * The name of the Cloud Run Service.
     * 
     */
    private final String name;
    private final List<GetServiceTemplateSpecVolumeSecret> secrets;

    @OutputCustomType.Constructor({"name","secrets"})
    private GetServiceTemplateSpecVolume(
        String name,
        List<GetServiceTemplateSpecVolumeSecret> secrets) {
        this.name = name;
        this.secrets = secrets;
    }

    /**
     * The name of the Cloud Run Service.
     * 
    */
    public String getName() {
        return this.name;
    }
    public List<GetServiceTemplateSpecVolumeSecret> getSecrets() {
        return this.secrets;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecrets(List<GetServiceTemplateSpecVolumeSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public GetServiceTemplateSpecVolume build() {
            return new GetServiceTemplateSpecVolume(name, secrets);
        }
    }
}
