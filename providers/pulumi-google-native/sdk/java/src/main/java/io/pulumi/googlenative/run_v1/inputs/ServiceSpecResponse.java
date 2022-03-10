// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.RevisionTemplateResponse;
import io.pulumi.googlenative.run_v1.inputs.TrafficTargetResponse;
import java.util.List;
import java.util.Objects;


/**
 * ServiceSpec holds the desired state of the Route (from the client), which is used to manipulate the underlying Route and Configuration(s).
 * 
 */
public final class ServiceSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceSpecResponse Empty = new ServiceSpecResponse();

    /**
     * Template holds the latest specification for the Revision to be stamped out.
     * 
     */
    @InputImport(name="template", required=true)
      private final RevisionTemplateResponse template;

    public RevisionTemplateResponse getTemplate() {
        return this.template;
    }

    /**
     * Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
     * 
     */
    @InputImport(name="traffic", required=true)
      private final List<TrafficTargetResponse> traffic;

    public List<TrafficTargetResponse> getTraffic() {
        return this.traffic;
    }

    public ServiceSpecResponse(
        RevisionTemplateResponse template,
        List<TrafficTargetResponse> traffic) {
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.traffic = Objects.requireNonNull(traffic, "expected parameter 'traffic' to be non-null");
    }

    private ServiceSpecResponse() {
        this.template = null;
        this.traffic = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RevisionTemplateResponse template;
        private List<TrafficTargetResponse> traffic;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.template = defaults.template;
    	      this.traffic = defaults.traffic;
        }

        public Builder template(RevisionTemplateResponse template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder traffic(List<TrafficTargetResponse> traffic) {
            this.traffic = Objects.requireNonNull(traffic);
            return this;
        }
        public ServiceSpecResponse build() {
            return new ServiceSpecResponse(template, traffic);
        }
    }
}
