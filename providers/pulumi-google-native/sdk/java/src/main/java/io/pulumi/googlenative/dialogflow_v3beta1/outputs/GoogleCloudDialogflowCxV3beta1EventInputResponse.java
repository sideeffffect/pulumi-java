// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1EventInputResponse {
    /**
     * Name of the event.
     * 
     */
    private final String event;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1EventInputResponse(@OutputCustomType.Parameter("event") String event) {
        this.event = event;
    }

    /**
     * Name of the event.
     * 
    */
    public String getEvent() {
        return this.event;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EventInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EventInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
        }

        public Builder event(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1EventInputResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EventInputResponse(event);
        }
    }
}
