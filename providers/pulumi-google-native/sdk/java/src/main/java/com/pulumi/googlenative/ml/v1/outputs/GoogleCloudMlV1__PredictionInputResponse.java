// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__PredictionInputResponse {
    /**
     * @return Optional. Number of records per batch, defaults to 64. The service will buffer batch_size number of records in memory before invoking one Tensorflow prediction call internally. So take the record size and memory available into consideration when setting this parameter.
     * 
     */
    private final String batchSize;
    /**
     * @return The format of the input data files.
     * 
     */
    private final String dataFormat;
    /**
     * @return The Cloud Storage location of the input data files. May contain wildcards.
     * 
     */
    private final List<String> inputPaths;
    /**
     * @return Optional. The maximum number of workers to be used for parallel processing. Defaults to 10 if not specified.
     * 
     */
    private final String maxWorkerCount;
    /**
     * @return Use this field if you want to use the default version for the specified model. The string must use the following format: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL&#34;`
     * 
     */
    private final String modelName;
    /**
     * @return Optional. Format of the output data files, defaults to JSON.
     * 
     */
    private final String outputDataFormat;
    /**
     * @return The output Google Cloud Storage location.
     * 
     */
    private final String outputPath;
    /**
     * @return The Google Compute Engine region to run the prediction job in. See the available regions for AI Platform services.
     * 
     */
    private final String region;
    /**
     * @return Optional. The AI Platform runtime version to use for this batch prediction. If not set, AI Platform will pick the runtime version used during the CreateVersion request for this model version, or choose the latest stable version when model version information is not available such as when the model is specified by uri.
     * 
     */
    private final String runtimeVersion;
    /**
     * @return Optional. The name of the signature defined in the SavedModel to use for this job. Please refer to [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for information about how to use signatures. Defaults to [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants) , which is &#34;serving_default&#34;.
     * 
     */
    private final String signatureName;
    /**
     * @return Use this field if you want to specify a Google Cloud Storage path for the model to use.
     * 
     */
    private final String uri;
    /**
     * @return Use this field if you want to specify a version of the model to use. The string is formatted the same way as `model_version`, with the addition of the version information: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION&#34;`
     * 
     */
    private final String versionName;

    @CustomType.Constructor
    private GoogleCloudMlV1__PredictionInputResponse(
        @CustomType.Parameter("batchSize") String batchSize,
        @CustomType.Parameter("dataFormat") String dataFormat,
        @CustomType.Parameter("inputPaths") List<String> inputPaths,
        @CustomType.Parameter("maxWorkerCount") String maxWorkerCount,
        @CustomType.Parameter("modelName") String modelName,
        @CustomType.Parameter("outputDataFormat") String outputDataFormat,
        @CustomType.Parameter("outputPath") String outputPath,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("runtimeVersion") String runtimeVersion,
        @CustomType.Parameter("signatureName") String signatureName,
        @CustomType.Parameter("uri") String uri,
        @CustomType.Parameter("versionName") String versionName) {
        this.batchSize = batchSize;
        this.dataFormat = dataFormat;
        this.inputPaths = inputPaths;
        this.maxWorkerCount = maxWorkerCount;
        this.modelName = modelName;
        this.outputDataFormat = outputDataFormat;
        this.outputPath = outputPath;
        this.region = region;
        this.runtimeVersion = runtimeVersion;
        this.signatureName = signatureName;
        this.uri = uri;
        this.versionName = versionName;
    }

    /**
     * @return Optional. Number of records per batch, defaults to 64. The service will buffer batch_size number of records in memory before invoking one Tensorflow prediction call internally. So take the record size and memory available into consideration when setting this parameter.
     * 
     */
    public String batchSize() {
        return this.batchSize;
    }
    /**
     * @return The format of the input data files.
     * 
     */
    public String dataFormat() {
        return this.dataFormat;
    }
    /**
     * @return The Cloud Storage location of the input data files. May contain wildcards.
     * 
     */
    public List<String> inputPaths() {
        return this.inputPaths;
    }
    /**
     * @return Optional. The maximum number of workers to be used for parallel processing. Defaults to 10 if not specified.
     * 
     */
    public String maxWorkerCount() {
        return this.maxWorkerCount;
    }
    /**
     * @return Use this field if you want to use the default version for the specified model. The string must use the following format: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL&#34;`
     * 
     */
    public String modelName() {
        return this.modelName;
    }
    /**
     * @return Optional. Format of the output data files, defaults to JSON.
     * 
     */
    public String outputDataFormat() {
        return this.outputDataFormat;
    }
    /**
     * @return The output Google Cloud Storage location.
     * 
     */
    public String outputPath() {
        return this.outputPath;
    }
    /**
     * @return The Google Compute Engine region to run the prediction job in. See the available regions for AI Platform services.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Optional. The AI Platform runtime version to use for this batch prediction. If not set, AI Platform will pick the runtime version used during the CreateVersion request for this model version, or choose the latest stable version when model version information is not available such as when the model is specified by uri.
     * 
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * @return Optional. The name of the signature defined in the SavedModel to use for this job. Please refer to [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for information about how to use signatures. Defaults to [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants) , which is &#34;serving_default&#34;.
     * 
     */
    public String signatureName() {
        return this.signatureName;
    }
    /**
     * @return Use this field if you want to specify a Google Cloud Storage path for the model to use.
     * 
     */
    public String uri() {
        return this.uri;
    }
    /**
     * @return Use this field if you want to specify a version of the model to use. The string is formatted the same way as `model_version`, with the addition of the version information: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION&#34;`
     * 
     */
    public String versionName() {
        return this.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__PredictionInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String batchSize;
        private String dataFormat;
        private List<String> inputPaths;
        private String maxWorkerCount;
        private String modelName;
        private String outputDataFormat;
        private String outputPath;
        private String region;
        private String runtimeVersion;
        private String signatureName;
        private String uri;
        private String versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__PredictionInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.dataFormat = defaults.dataFormat;
    	      this.inputPaths = defaults.inputPaths;
    	      this.maxWorkerCount = defaults.maxWorkerCount;
    	      this.modelName = defaults.modelName;
    	      this.outputDataFormat = defaults.outputDataFormat;
    	      this.outputPath = defaults.outputPath;
    	      this.region = defaults.region;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.signatureName = defaults.signatureName;
    	      this.uri = defaults.uri;
    	      this.versionName = defaults.versionName;
        }

        public Builder batchSize(String batchSize) {
            this.batchSize = Objects.requireNonNull(batchSize);
            return this;
        }
        public Builder dataFormat(String dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }
        public Builder inputPaths(List<String> inputPaths) {
            this.inputPaths = Objects.requireNonNull(inputPaths);
            return this;
        }
        public Builder inputPaths(String... inputPaths) {
            return inputPaths(List.of(inputPaths));
        }
        public Builder maxWorkerCount(String maxWorkerCount) {
            this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount);
            return this;
        }
        public Builder modelName(String modelName) {
            this.modelName = Objects.requireNonNull(modelName);
            return this;
        }
        public Builder outputDataFormat(String outputDataFormat) {
            this.outputDataFormat = Objects.requireNonNull(outputDataFormat);
            return this;
        }
        public Builder outputPath(String outputPath) {
            this.outputPath = Objects.requireNonNull(outputPath);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }
        public Builder signatureName(String signatureName) {
            this.signatureName = Objects.requireNonNull(signatureName);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder versionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }        public GoogleCloudMlV1__PredictionInputResponse build() {
            return new GoogleCloudMlV1__PredictionInputResponse(batchSize, dataFormat, inputPaths, maxWorkerCount, modelName, outputDataFormat, outputPath, region, runtimeVersion, signatureName, uri, versionName);
        }
    }
}
