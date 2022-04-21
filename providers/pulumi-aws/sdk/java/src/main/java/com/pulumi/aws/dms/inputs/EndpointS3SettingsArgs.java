// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointS3SettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointS3SettingsArgs Empty = new EndpointS3SettingsArgs();

    /**
     * S3 Bucket Object prefix.
     * 
     */
    @Import(name="bucketFolder")
    private @Nullable Output<String> bucketFolder;

    public Optional<Output<String>> bucketFolder() {
        return Optional.ofNullable(this.bucketFolder);
    }

    /**
     * S3 Bucket name.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
     * 
     */
    @Import(name="compressionType")
    private @Nullable Output<String> compressionType;

    public Optional<Output<String>> compressionType() {
        return Optional.ofNullable(this.compressionType);
    }

    /**
     * Delimiter used to separate columns in the source files. Defaults to `,`.
     * 
     */
    @Import(name="csvDelimiter")
    private @Nullable Output<String> csvDelimiter;

    public Optional<Output<String>> csvDelimiter() {
        return Optional.ofNullable(this.csvDelimiter);
    }

    /**
     * Delimiter used to separate rows in the source files. Defaults to `\n`.
     * 
     */
    @Import(name="csvRowDelimiter")
    private @Nullable Output<String> csvRowDelimiter;

    public Optional<Output<String>> csvRowDelimiter() {
        return Optional.ofNullable(this.csvRowDelimiter);
    }

    /**
     * The output format for the files that AWS DMS uses to create S3 objects. Defaults to `csv`. Valid values are `csv` and `parquet`.
     * 
     */
    @Import(name="dataFormat")
    private @Nullable Output<String> dataFormat;

    public Optional<Output<String>> dataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }

    /**
     * Partition S3 bucket folders based on transaction commit dates. Defaults to `false`.
     * 
     */
    @Import(name="datePartitionEnabled")
    private @Nullable Output<Boolean> datePartitionEnabled;

    public Optional<Output<Boolean>> datePartitionEnabled() {
        return Optional.ofNullable(this.datePartitionEnabled);
    }

    /**
     * The server-side encryption mode that you want to encrypt your .csv or .parquet object files copied to S3. Defaults to `SSE_S3`. Valid values are `SSE_S3` and `SSE_KMS`.
     * 
     */
    @Import(name="encryptionMode")
    private @Nullable Output<String> encryptionMode;

    public Optional<Output<String>> encryptionMode() {
        return Optional.ofNullable(this.encryptionMode);
    }

    /**
     * JSON document that describes how AWS DMS should interpret the data.
     * 
     */
    @Import(name="externalTableDefinition")
    private @Nullable Output<String> externalTableDefinition;

    public Optional<Output<String>> externalTableDefinition() {
        return Optional.ofNullable(this.externalTableDefinition);
    }

    /**
     * - Specifies the precision of any TIMESTAMP column values written to an S3 object file in .parquet format. Defaults to `false`.
     * 
     */
    @Import(name="parquetTimestampInMillisecond")
    private @Nullable Output<Boolean> parquetTimestampInMillisecond;

    public Optional<Output<Boolean>> parquetTimestampInMillisecond() {
        return Optional.ofNullable(this.parquetTimestampInMillisecond);
    }

    /**
     * The version of the .parquet file format. Defaults to `parquet-1-0`. Valid values are `parquet-1-0` and `parquet-2-0`.
     * 
     */
    @Import(name="parquetVersion")
    private @Nullable Output<String> parquetVersion;

    public Optional<Output<String>> parquetVersion() {
        return Optional.ofNullable(this.parquetVersion);
    }

    /**
     * If you set encryptionMode to `SSE_KMS`, set this parameter to the Amazon Resource Name (ARN) for the AWS KMS key.
     * 
     */
    @Import(name="serverSideEncryptionKmsKeyId")
    private @Nullable Output<String> serverSideEncryptionKmsKeyId;

    public Optional<Output<String>> serverSideEncryptionKmsKeyId() {
        return Optional.ofNullable(this.serverSideEncryptionKmsKeyId);
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
     * 
     */
    @Import(name="serviceAccessRoleArn")
    private @Nullable Output<String> serviceAccessRoleArn;

    public Optional<Output<String>> serviceAccessRoleArn() {
        return Optional.ofNullable(this.serviceAccessRoleArn);
    }

    private EndpointS3SettingsArgs() {}

    private EndpointS3SettingsArgs(EndpointS3SettingsArgs $) {
        this.bucketFolder = $.bucketFolder;
        this.bucketName = $.bucketName;
        this.compressionType = $.compressionType;
        this.csvDelimiter = $.csvDelimiter;
        this.csvRowDelimiter = $.csvRowDelimiter;
        this.dataFormat = $.dataFormat;
        this.datePartitionEnabled = $.datePartitionEnabled;
        this.encryptionMode = $.encryptionMode;
        this.externalTableDefinition = $.externalTableDefinition;
        this.parquetTimestampInMillisecond = $.parquetTimestampInMillisecond;
        this.parquetVersion = $.parquetVersion;
        this.serverSideEncryptionKmsKeyId = $.serverSideEncryptionKmsKeyId;
        this.serviceAccessRoleArn = $.serviceAccessRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointS3SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointS3SettingsArgs $;

        public Builder() {
            $ = new EndpointS3SettingsArgs();
        }

        public Builder(EndpointS3SettingsArgs defaults) {
            $ = new EndpointS3SettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketFolder(@Nullable Output<String> bucketFolder) {
            $.bucketFolder = bucketFolder;
            return this;
        }

        public Builder bucketFolder(String bucketFolder) {
            return bucketFolder(Output.of(bucketFolder));
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder compressionType(@Nullable Output<String> compressionType) {
            $.compressionType = compressionType;
            return this;
        }

        public Builder compressionType(String compressionType) {
            return compressionType(Output.of(compressionType));
        }

        public Builder csvDelimiter(@Nullable Output<String> csvDelimiter) {
            $.csvDelimiter = csvDelimiter;
            return this;
        }

        public Builder csvDelimiter(String csvDelimiter) {
            return csvDelimiter(Output.of(csvDelimiter));
        }

        public Builder csvRowDelimiter(@Nullable Output<String> csvRowDelimiter) {
            $.csvRowDelimiter = csvRowDelimiter;
            return this;
        }

        public Builder csvRowDelimiter(String csvRowDelimiter) {
            return csvRowDelimiter(Output.of(csvRowDelimiter));
        }

        public Builder dataFormat(@Nullable Output<String> dataFormat) {
            $.dataFormat = dataFormat;
            return this;
        }

        public Builder dataFormat(String dataFormat) {
            return dataFormat(Output.of(dataFormat));
        }

        public Builder datePartitionEnabled(@Nullable Output<Boolean> datePartitionEnabled) {
            $.datePartitionEnabled = datePartitionEnabled;
            return this;
        }

        public Builder datePartitionEnabled(Boolean datePartitionEnabled) {
            return datePartitionEnabled(Output.of(datePartitionEnabled));
        }

        public Builder encryptionMode(@Nullable Output<String> encryptionMode) {
            $.encryptionMode = encryptionMode;
            return this;
        }

        public Builder encryptionMode(String encryptionMode) {
            return encryptionMode(Output.of(encryptionMode));
        }

        public Builder externalTableDefinition(@Nullable Output<String> externalTableDefinition) {
            $.externalTableDefinition = externalTableDefinition;
            return this;
        }

        public Builder externalTableDefinition(String externalTableDefinition) {
            return externalTableDefinition(Output.of(externalTableDefinition));
        }

        public Builder parquetTimestampInMillisecond(@Nullable Output<Boolean> parquetTimestampInMillisecond) {
            $.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
            return this;
        }

        public Builder parquetTimestampInMillisecond(Boolean parquetTimestampInMillisecond) {
            return parquetTimestampInMillisecond(Output.of(parquetTimestampInMillisecond));
        }

        public Builder parquetVersion(@Nullable Output<String> parquetVersion) {
            $.parquetVersion = parquetVersion;
            return this;
        }

        public Builder parquetVersion(String parquetVersion) {
            return parquetVersion(Output.of(parquetVersion));
        }

        public Builder serverSideEncryptionKmsKeyId(@Nullable Output<String> serverSideEncryptionKmsKeyId) {
            $.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
            return this;
        }

        public Builder serverSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
            return serverSideEncryptionKmsKeyId(Output.of(serverSideEncryptionKmsKeyId));
        }

        public Builder serviceAccessRoleArn(@Nullable Output<String> serviceAccessRoleArn) {
            $.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        public Builder serviceAccessRoleArn(String serviceAccessRoleArn) {
            return serviceAccessRoleArn(Output.of(serviceAccessRoleArn));
        }

        public EndpointS3SettingsArgs build() {
            return $;
        }
    }

}
