// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.inputs.AwsS3DataArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.AzureBlobStorageDataArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.GcsDataArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.HttpDataArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.ObjectConditionsArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.PosixFilesystemArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.TransferManifestArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.TransferOptionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for running a transfer.
 * 
 */
public final class TransferSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferSpecArgs Empty = new TransferSpecArgs();

    /**
     * An AWS S3 data source.
     * 
     */
    @InputImport(name="awsS3DataSource")
      private final @Nullable Input<AwsS3DataArgs> awsS3DataSource;

    public Input<AwsS3DataArgs> getAwsS3DataSource() {
        return this.awsS3DataSource == null ? Input.empty() : this.awsS3DataSource;
    }

    /**
     * An Azure Blob Storage data source.
     * 
     */
    @InputImport(name="azureBlobStorageDataSource")
      private final @Nullable Input<AzureBlobStorageDataArgs> azureBlobStorageDataSource;

    public Input<AzureBlobStorageDataArgs> getAzureBlobStorageDataSource() {
        return this.azureBlobStorageDataSource == null ? Input.empty() : this.azureBlobStorageDataSource;
    }

    /**
     * A Cloud Storage data sink.
     * 
     */
    @InputImport(name="gcsDataSink")
      private final @Nullable Input<GcsDataArgs> gcsDataSink;

    public Input<GcsDataArgs> getGcsDataSink() {
        return this.gcsDataSink == null ? Input.empty() : this.gcsDataSink;
    }

    /**
     * A Cloud Storage data source.
     * 
     */
    @InputImport(name="gcsDataSource")
      private final @Nullable Input<GcsDataArgs> gcsDataSource;

    public Input<GcsDataArgs> getGcsDataSource() {
        return this.gcsDataSource == null ? Input.empty() : this.gcsDataSource;
    }

    /**
     * Cloud Storage intermediate data location.
     * 
     */
    @InputImport(name="gcsIntermediateDataLocation")
      private final @Nullable Input<GcsDataArgs> gcsIntermediateDataLocation;

    public Input<GcsDataArgs> getGcsIntermediateDataLocation() {
        return this.gcsIntermediateDataLocation == null ? Input.empty() : this.gcsIntermediateDataLocation;
    }

    /**
     * An HTTP URL data source.
     * 
     */
    @InputImport(name="httpDataSource")
      private final @Nullable Input<HttpDataArgs> httpDataSource;

    public Input<HttpDataArgs> getHttpDataSource() {
        return this.httpDataSource == null ? Input.empty() : this.httpDataSource;
    }

    /**
     * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' "last modification time" do not exclude objects in a data sink.
     * 
     */
    @InputImport(name="objectConditions")
      private final @Nullable Input<ObjectConditionsArgs> objectConditions;

    public Input<ObjectConditionsArgs> getObjectConditions() {
        return this.objectConditions == null ? Input.empty() : this.objectConditions;
    }

    /**
     * A POSIX Filesystem data sink.
     * 
     */
    @InputImport(name="posixDataSink")
      private final @Nullable Input<PosixFilesystemArgs> posixDataSink;

    public Input<PosixFilesystemArgs> getPosixDataSink() {
        return this.posixDataSink == null ? Input.empty() : this.posixDataSink;
    }

    /**
     * A POSIX Filesystem data source.
     * 
     */
    @InputImport(name="posixDataSource")
      private final @Nullable Input<PosixFilesystemArgs> posixDataSource;

    public Input<PosixFilesystemArgs> getPosixDataSource() {
        return this.posixDataSource == null ? Input.empty() : this.posixDataSource;
    }

    /**
     * Specifies the agent pool name associated with the posix data sink. When unspecified, the default name is used.
     * 
     */
    @InputImport(name="sinkAgentPoolName")
      private final @Nullable Input<String> sinkAgentPoolName;

    public Input<String> getSinkAgentPoolName() {
        return this.sinkAgentPoolName == null ? Input.empty() : this.sinkAgentPoolName;
    }

    /**
     * Specifies the agent pool name associated with the posix data source. When unspecified, the default name is used.
     * 
     */
    @InputImport(name="sourceAgentPoolName")
      private final @Nullable Input<String> sourceAgentPoolName;

    public Input<String> getSourceAgentPoolName() {
        return this.sourceAgentPoolName == null ? Input.empty() : this.sourceAgentPoolName;
    }

    /**
     * A manifest file provides a list of objects to be transferred from the data source. This field points to the location of the manifest file. Otherwise, the entire source bucket is used. ObjectConditions still apply.
     * 
     */
    @InputImport(name="transferManifest")
      private final @Nullable Input<TransferManifestArgs> transferManifest;

    public Input<TransferManifestArgs> getTransferManifest() {
        return this.transferManifest == null ? Input.empty() : this.transferManifest;
    }

    /**
     * If the option delete_objects_unique_in_sink is `true` and time-based object conditions such as 'last modification time' are specified, the request fails with an INVALID_ARGUMENT error.
     * 
     */
    @InputImport(name="transferOptions")
      private final @Nullable Input<TransferOptionsArgs> transferOptions;

    public Input<TransferOptionsArgs> getTransferOptions() {
        return this.transferOptions == null ? Input.empty() : this.transferOptions;
    }

    public TransferSpecArgs(
        @Nullable Input<AwsS3DataArgs> awsS3DataSource,
        @Nullable Input<AzureBlobStorageDataArgs> azureBlobStorageDataSource,
        @Nullable Input<GcsDataArgs> gcsDataSink,
        @Nullable Input<GcsDataArgs> gcsDataSource,
        @Nullable Input<GcsDataArgs> gcsIntermediateDataLocation,
        @Nullable Input<HttpDataArgs> httpDataSource,
        @Nullable Input<ObjectConditionsArgs> objectConditions,
        @Nullable Input<PosixFilesystemArgs> posixDataSink,
        @Nullable Input<PosixFilesystemArgs> posixDataSource,
        @Nullable Input<String> sinkAgentPoolName,
        @Nullable Input<String> sourceAgentPoolName,
        @Nullable Input<TransferManifestArgs> transferManifest,
        @Nullable Input<TransferOptionsArgs> transferOptions) {
        this.awsS3DataSource = awsS3DataSource;
        this.azureBlobStorageDataSource = azureBlobStorageDataSource;
        this.gcsDataSink = gcsDataSink;
        this.gcsDataSource = gcsDataSource;
        this.gcsIntermediateDataLocation = gcsIntermediateDataLocation;
        this.httpDataSource = httpDataSource;
        this.objectConditions = objectConditions;
        this.posixDataSink = posixDataSink;
        this.posixDataSource = posixDataSource;
        this.sinkAgentPoolName = sinkAgentPoolName;
        this.sourceAgentPoolName = sourceAgentPoolName;
        this.transferManifest = transferManifest;
        this.transferOptions = transferOptions;
    }

    private TransferSpecArgs() {
        this.awsS3DataSource = Input.empty();
        this.azureBlobStorageDataSource = Input.empty();
        this.gcsDataSink = Input.empty();
        this.gcsDataSource = Input.empty();
        this.gcsIntermediateDataLocation = Input.empty();
        this.httpDataSource = Input.empty();
        this.objectConditions = Input.empty();
        this.posixDataSink = Input.empty();
        this.posixDataSource = Input.empty();
        this.sinkAgentPoolName = Input.empty();
        this.sourceAgentPoolName = Input.empty();
        this.transferManifest = Input.empty();
        this.transferOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AwsS3DataArgs> awsS3DataSource;
        private @Nullable Input<AzureBlobStorageDataArgs> azureBlobStorageDataSource;
        private @Nullable Input<GcsDataArgs> gcsDataSink;
        private @Nullable Input<GcsDataArgs> gcsDataSource;
        private @Nullable Input<GcsDataArgs> gcsIntermediateDataLocation;
        private @Nullable Input<HttpDataArgs> httpDataSource;
        private @Nullable Input<ObjectConditionsArgs> objectConditions;
        private @Nullable Input<PosixFilesystemArgs> posixDataSink;
        private @Nullable Input<PosixFilesystemArgs> posixDataSource;
        private @Nullable Input<String> sinkAgentPoolName;
        private @Nullable Input<String> sourceAgentPoolName;
        private @Nullable Input<TransferManifestArgs> transferManifest;
        private @Nullable Input<TransferOptionsArgs> transferOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsS3DataSource = defaults.awsS3DataSource;
    	      this.azureBlobStorageDataSource = defaults.azureBlobStorageDataSource;
    	      this.gcsDataSink = defaults.gcsDataSink;
    	      this.gcsDataSource = defaults.gcsDataSource;
    	      this.gcsIntermediateDataLocation = defaults.gcsIntermediateDataLocation;
    	      this.httpDataSource = defaults.httpDataSource;
    	      this.objectConditions = defaults.objectConditions;
    	      this.posixDataSink = defaults.posixDataSink;
    	      this.posixDataSource = defaults.posixDataSource;
    	      this.sinkAgentPoolName = defaults.sinkAgentPoolName;
    	      this.sourceAgentPoolName = defaults.sourceAgentPoolName;
    	      this.transferManifest = defaults.transferManifest;
    	      this.transferOptions = defaults.transferOptions;
        }

        public Builder awsS3DataSource(@Nullable Input<AwsS3DataArgs> awsS3DataSource) {
            this.awsS3DataSource = awsS3DataSource;
            return this;
        }

        public Builder awsS3DataSource(@Nullable AwsS3DataArgs awsS3DataSource) {
            this.awsS3DataSource = Input.ofNullable(awsS3DataSource);
            return this;
        }

        public Builder azureBlobStorageDataSource(@Nullable Input<AzureBlobStorageDataArgs> azureBlobStorageDataSource) {
            this.azureBlobStorageDataSource = azureBlobStorageDataSource;
            return this;
        }

        public Builder azureBlobStorageDataSource(@Nullable AzureBlobStorageDataArgs azureBlobStorageDataSource) {
            this.azureBlobStorageDataSource = Input.ofNullable(azureBlobStorageDataSource);
            return this;
        }

        public Builder gcsDataSink(@Nullable Input<GcsDataArgs> gcsDataSink) {
            this.gcsDataSink = gcsDataSink;
            return this;
        }

        public Builder gcsDataSink(@Nullable GcsDataArgs gcsDataSink) {
            this.gcsDataSink = Input.ofNullable(gcsDataSink);
            return this;
        }

        public Builder gcsDataSource(@Nullable Input<GcsDataArgs> gcsDataSource) {
            this.gcsDataSource = gcsDataSource;
            return this;
        }

        public Builder gcsDataSource(@Nullable GcsDataArgs gcsDataSource) {
            this.gcsDataSource = Input.ofNullable(gcsDataSource);
            return this;
        }

        public Builder gcsIntermediateDataLocation(@Nullable Input<GcsDataArgs> gcsIntermediateDataLocation) {
            this.gcsIntermediateDataLocation = gcsIntermediateDataLocation;
            return this;
        }

        public Builder gcsIntermediateDataLocation(@Nullable GcsDataArgs gcsIntermediateDataLocation) {
            this.gcsIntermediateDataLocation = Input.ofNullable(gcsIntermediateDataLocation);
            return this;
        }

        public Builder httpDataSource(@Nullable Input<HttpDataArgs> httpDataSource) {
            this.httpDataSource = httpDataSource;
            return this;
        }

        public Builder httpDataSource(@Nullable HttpDataArgs httpDataSource) {
            this.httpDataSource = Input.ofNullable(httpDataSource);
            return this;
        }

        public Builder objectConditions(@Nullable Input<ObjectConditionsArgs> objectConditions) {
            this.objectConditions = objectConditions;
            return this;
        }

        public Builder objectConditions(@Nullable ObjectConditionsArgs objectConditions) {
            this.objectConditions = Input.ofNullable(objectConditions);
            return this;
        }

        public Builder posixDataSink(@Nullable Input<PosixFilesystemArgs> posixDataSink) {
            this.posixDataSink = posixDataSink;
            return this;
        }

        public Builder posixDataSink(@Nullable PosixFilesystemArgs posixDataSink) {
            this.posixDataSink = Input.ofNullable(posixDataSink);
            return this;
        }

        public Builder posixDataSource(@Nullable Input<PosixFilesystemArgs> posixDataSource) {
            this.posixDataSource = posixDataSource;
            return this;
        }

        public Builder posixDataSource(@Nullable PosixFilesystemArgs posixDataSource) {
            this.posixDataSource = Input.ofNullable(posixDataSource);
            return this;
        }

        public Builder sinkAgentPoolName(@Nullable Input<String> sinkAgentPoolName) {
            this.sinkAgentPoolName = sinkAgentPoolName;
            return this;
        }

        public Builder sinkAgentPoolName(@Nullable String sinkAgentPoolName) {
            this.sinkAgentPoolName = Input.ofNullable(sinkAgentPoolName);
            return this;
        }

        public Builder sourceAgentPoolName(@Nullable Input<String> sourceAgentPoolName) {
            this.sourceAgentPoolName = sourceAgentPoolName;
            return this;
        }

        public Builder sourceAgentPoolName(@Nullable String sourceAgentPoolName) {
            this.sourceAgentPoolName = Input.ofNullable(sourceAgentPoolName);
            return this;
        }

        public Builder transferManifest(@Nullable Input<TransferManifestArgs> transferManifest) {
            this.transferManifest = transferManifest;
            return this;
        }

        public Builder transferManifest(@Nullable TransferManifestArgs transferManifest) {
            this.transferManifest = Input.ofNullable(transferManifest);
            return this;
        }

        public Builder transferOptions(@Nullable Input<TransferOptionsArgs> transferOptions) {
            this.transferOptions = transferOptions;
            return this;
        }

        public Builder transferOptions(@Nullable TransferOptionsArgs transferOptions) {
            this.transferOptions = Input.ofNullable(transferOptions);
            return this;
        }
        public TransferSpecArgs build() {
            return new TransferSpecArgs(awsS3DataSource, azureBlobStorageDataSource, gcsDataSink, gcsDataSource, gcsIntermediateDataLocation, httpDataSource, objectConditions, posixDataSink, posixDataSource, sinkAgentPoolName, sourceAgentPoolName, transferManifest, transferOptions);
        }
    }
}
