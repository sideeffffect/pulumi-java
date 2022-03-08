// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.eventarc_v1.outputs.CloudRunResponse;
import io.pulumi.googlenative.eventarc_v1.outputs.GKEResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DestinationResponse {
    /**
     * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    private final String cloudFunction;
    /**
     * Cloud Run fully-managed resource that receives the events. The resource should be in the same project as the trigger.
     * 
     */
    private final CloudRunResponse cloudRun;
    /**
     * A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     * 
     */
    private final GKEResponse gke;

    @OutputCustomType.Constructor({"cloudFunction","cloudRun","gke"})
    private DestinationResponse(
        String cloudFunction,
        CloudRunResponse cloudRun,
        GKEResponse gke) {
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.gke = gke;
    }

    /**
     * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: projects/{project}/locations/{location}/functions/{function}
     * 
    */
    public String getCloudFunction() {
        return this.cloudFunction;
    }
    /**
     * Cloud Run fully-managed resource that receives the events. The resource should be in the same project as the trigger.
     * 
    */
    public CloudRunResponse getCloudRun() {
        return this.cloudRun;
    }
    /**
     * A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     * 
    */
    public GKEResponse getGke() {
        return this.gke;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudFunction;
        private CloudRunResponse cloudRun;
        private GKEResponse gke;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.gke = defaults.gke;
        }

        public Builder setCloudFunction(String cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }

        public Builder setCloudRun(CloudRunResponse cloudRun) {
            this.cloudRun = Objects.requireNonNull(cloudRun);
            return this;
        }

        public Builder setGke(GKEResponse gke) {
            this.gke = Objects.requireNonNull(gke);
            return this;
        }
        public DestinationResponse build() {
            return new DestinationResponse(cloudFunction, cloudRun, gke);
        }
    }
}
