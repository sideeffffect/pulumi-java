// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__BuiltInAlgorithmOutputResponse {
    /**
     * @return Framework on which the built-in algorithm was trained.
     * 
     */
    private final String framework;
    /**
     * @return The Cloud Storage path to the `model/` directory where the training job saves the trained model. Only set for successful jobs that don&#39;t use hyperparameter tuning.
     * 
     */
    private final String modelPath;
    /**
     * @return Python version on which the built-in algorithm was trained.
     * 
     */
    private final String pythonVersion;
    /**
     * @return AI Platform runtime version on which the built-in algorithm was trained.
     * 
     */
    private final String runtimeVersion;

    @CustomType.Constructor
    private GoogleCloudMlV1__BuiltInAlgorithmOutputResponse(
        @CustomType.Parameter("framework") String framework,
        @CustomType.Parameter("modelPath") String modelPath,
        @CustomType.Parameter("pythonVersion") String pythonVersion,
        @CustomType.Parameter("runtimeVersion") String runtimeVersion) {
        this.framework = framework;
        this.modelPath = modelPath;
        this.pythonVersion = pythonVersion;
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * @return Framework on which the built-in algorithm was trained.
     * 
     */
    public String framework() {
        return this.framework;
    }
    /**
     * @return The Cloud Storage path to the `model/` directory where the training job saves the trained model. Only set for successful jobs that don&#39;t use hyperparameter tuning.
     * 
     */
    public String modelPath() {
        return this.modelPath;
    }
    /**
     * @return Python version on which the built-in algorithm was trained.
     * 
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }
    /**
     * @return AI Platform runtime version on which the built-in algorithm was trained.
     * 
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__BuiltInAlgorithmOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String framework;
        private String modelPath;
        private String pythonVersion;
        private String runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__BuiltInAlgorithmOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.framework = defaults.framework;
    	      this.modelPath = defaults.modelPath;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder framework(String framework) {
            this.framework = Objects.requireNonNull(framework);
            return this;
        }
        public Builder modelPath(String modelPath) {
            this.modelPath = Objects.requireNonNull(modelPath);
            return this;
        }
        public Builder pythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }        public GoogleCloudMlV1__BuiltInAlgorithmOutputResponse build() {
            return new GoogleCloudMlV1__BuiltInAlgorithmOutputResponse(framework, modelPath, pythonVersion, runtimeVersion);
        }
    }
}
