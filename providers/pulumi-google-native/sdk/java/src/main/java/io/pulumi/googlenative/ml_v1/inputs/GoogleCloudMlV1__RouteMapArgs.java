// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies HTTP paths served by a custom container. AI Platform Prediction sends requests to these paths on the container; the custom container must run an HTTP server that responds to these requests with appropriate responses. Read [Custom container requirements](/ai-platform/prediction/docs/custom-container-requirements) for details on how to create your container image to meet these requirements.
 * 
 */
public final class GoogleCloudMlV1__RouteMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__RouteMapArgs Empty = new GoogleCloudMlV1__RouteMapArgs();

    /**
     * HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container's IP address and port to check that the container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI Platform Prediction intermittently sends a GET request to the `/bar` path on the port of your container specified by the first value of Version.container.ports. If you don't specify this field, it defaults to the following value: /v1/models/ MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID /models/MODEL/versions/" prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    @InputImport(name="health")
      private final @Nullable Input<String> health;

    public Input<String> getHealth() {
        return this.health == null ? Input.empty() : this.health;
    }

    /**
     * HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container's IP address and port. AI Platform Prediction then returns the container's response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a prediction request, it forwards the request body in a POST request to the `/foo` path on the port of your container specified by the first value of Version.container.ports. If you don't specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID/models/MODEL/versions/" prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    @InputImport(name="predict")
      private final @Nullable Input<String> predict;

    public Input<String> getPredict() {
        return this.predict == null ? Input.empty() : this.predict;
    }

    public GoogleCloudMlV1__RouteMapArgs(
        @Nullable Input<String> health,
        @Nullable Input<String> predict) {
        this.health = health;
        this.predict = predict;
    }

    private GoogleCloudMlV1__RouteMapArgs() {
        this.health = Input.empty();
        this.predict = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__RouteMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> health;
        private @Nullable Input<String> predict;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__RouteMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.predict = defaults.predict;
        }

        public Builder health(@Nullable Input<String> health) {
            this.health = health;
            return this;
        }

        public Builder health(@Nullable String health) {
            this.health = Input.ofNullable(health);
            return this;
        }

        public Builder predict(@Nullable Input<String> predict) {
            this.predict = predict;
            return this;
        }

        public Builder predict(@Nullable String predict) {
            this.predict = Input.ofNullable(predict);
            return this;
        }
        public GoogleCloudMlV1__RouteMapArgs build() {
            return new GoogleCloudMlV1__RouteMapArgs(health, predict);
        }
    }
}
