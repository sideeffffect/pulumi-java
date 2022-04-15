// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainer;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecVolume;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceTemplateSpec extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpec Empty = new GetServiceTemplateSpec();

    @Import(name="containerConcurrency", required=true)
      private final Integer containerConcurrency;

    public Integer containerConcurrency() {
        return this.containerConcurrency;
    }

    @Import(name="containers", required=true)
      private final List<GetServiceTemplateSpecContainer> containers;

    public List<GetServiceTemplateSpecContainer> containers() {
        return this.containers;
    }

    @Import(name="serviceAccountName", required=true)
      private final String serviceAccountName;

    public String serviceAccountName() {
        return this.serviceAccountName;
    }

    @Import(name="servingState", required=true)
      private final String servingState;

    public String servingState() {
        return this.servingState;
    }

    @Import(name="timeoutSeconds", required=true)
      private final Integer timeoutSeconds;

    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    @Import(name="volumes", required=true)
      private final List<GetServiceTemplateSpecVolume> volumes;

    public List<GetServiceTemplateSpecVolume> volumes() {
        return this.volumes;
    }

    public GetServiceTemplateSpec(
        Integer containerConcurrency,
        List<GetServiceTemplateSpecContainer> containers,
        String serviceAccountName,
        String servingState,
        Integer timeoutSeconds,
        List<GetServiceTemplateSpecVolume> volumes) {
        this.containerConcurrency = Objects.requireNonNull(containerConcurrency, "expected parameter 'containerConcurrency' to be non-null");
        this.containers = Objects.requireNonNull(containers, "expected parameter 'containers' to be non-null");
        this.serviceAccountName = Objects.requireNonNull(serviceAccountName, "expected parameter 'serviceAccountName' to be non-null");
        this.servingState = Objects.requireNonNull(servingState, "expected parameter 'servingState' to be non-null");
        this.timeoutSeconds = Objects.requireNonNull(timeoutSeconds, "expected parameter 'timeoutSeconds' to be non-null");
        this.volumes = Objects.requireNonNull(volumes, "expected parameter 'volumes' to be non-null");
    }

    private GetServiceTemplateSpec() {
        this.containerConcurrency = null;
        this.containers = List.of();
        this.serviceAccountName = null;
        this.servingState = null;
        this.timeoutSeconds = null;
        this.volumes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerConcurrency;
        private List<GetServiceTemplateSpecContainer> containers;
        private String serviceAccountName;
        private String servingState;
        private Integer timeoutSeconds;
        private List<GetServiceTemplateSpecVolume> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerConcurrency = defaults.containerConcurrency;
    	      this.containers = defaults.containers;
    	      this.serviceAccountName = defaults.serviceAccountName;
    	      this.servingState = defaults.servingState;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.volumes = defaults.volumes;
        }

        public Builder containerConcurrency(Integer containerConcurrency) {
            this.containerConcurrency = Objects.requireNonNull(containerConcurrency);
            return this;
        }
        public Builder containers(List<GetServiceTemplateSpecContainer> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }
        public Builder containers(GetServiceTemplateSpecContainer... containers) {
            return containers(List.of(containers));
        }
        public Builder serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = Objects.requireNonNull(serviceAccountName);
            return this;
        }
        public Builder servingState(String servingState) {
            this.servingState = Objects.requireNonNull(servingState);
            return this;
        }
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = Objects.requireNonNull(timeoutSeconds);
            return this;
        }
        public Builder volumes(List<GetServiceTemplateSpecVolume> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public Builder volumes(GetServiceTemplateSpecVolume... volumes) {
            return volumes(List.of(volumes));
        }        public GetServiceTemplateSpec build() {
            return new GetServiceTemplateSpec(containerConcurrency, containers, serviceAccountName, servingState, timeoutSeconds, volumes);
        }
    }
}
