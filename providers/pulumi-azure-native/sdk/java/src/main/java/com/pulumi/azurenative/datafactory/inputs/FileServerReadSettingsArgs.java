// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * File server read settings.
 * 
 */
public final class FileServerReadSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileServerReadSettingsArgs Empty = new FileServerReadSettingsArgs();

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="deleteFilesAfterCompletion")
    private @Nullable Output<Object> deleteFilesAfterCompletion;

    public Optional<Output<Object>> deleteFilesAfterCompletion() {
        return Optional.ofNullable(this.deleteFilesAfterCompletion);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    @Import(name="enablePartitionDiscovery")
    private @Nullable Output<Boolean> enablePartitionDiscovery;

    public Optional<Output<Boolean>> enablePartitionDiscovery() {
        return Optional.ofNullable(this.enablePartitionDiscovery);
    }

    /**
     * Specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileFilter")
    private @Nullable Output<Object> fileFilter;

    public Optional<Output<Object>> fileFilter() {
        return Optional.ofNullable(this.fileFilter);
    }

    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileListPath")
    private @Nullable Output<Object> fileListPath;

    public Optional<Output<Object>> fileListPath() {
        return Optional.ofNullable(this.fileListPath);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
    private @Nullable Output<Object> modifiedDatetimeEnd;

    public Optional<Output<Object>> modifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
    private @Nullable Output<Object> modifiedDatetimeStart;

    public Optional<Output<Object>> modifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionRootPath")
    private @Nullable Output<Object> partitionRootPath;

    public Optional<Output<Object>> partitionRootPath() {
        return Optional.ofNullable(this.partitionRootPath);
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
    private @Nullable Output<Object> recursive;

    public Optional<Output<Object>> recursive() {
        return Optional.ofNullable(this.recursive);
    }

    /**
     * The read setting type.
     * Expected value is &#39;FileServerReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * FileServer wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFileName")
    private @Nullable Output<Object> wildcardFileName;

    public Optional<Output<Object>> wildcardFileName() {
        return Optional.ofNullable(this.wildcardFileName);
    }

    /**
     * FileServer wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFolderPath")
    private @Nullable Output<Object> wildcardFolderPath;

    public Optional<Output<Object>> wildcardFolderPath() {
        return Optional.ofNullable(this.wildcardFolderPath);
    }

    private FileServerReadSettingsArgs() {}

    private FileServerReadSettingsArgs(FileServerReadSettingsArgs $) {
        this.deleteFilesAfterCompletion = $.deleteFilesAfterCompletion;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.enablePartitionDiscovery = $.enablePartitionDiscovery;
        this.fileFilter = $.fileFilter;
        this.fileListPath = $.fileListPath;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.modifiedDatetimeEnd = $.modifiedDatetimeEnd;
        this.modifiedDatetimeStart = $.modifiedDatetimeStart;
        this.partitionRootPath = $.partitionRootPath;
        this.recursive = $.recursive;
        this.type = $.type;
        this.wildcardFileName = $.wildcardFileName;
        this.wildcardFolderPath = $.wildcardFolderPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileServerReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileServerReadSettingsArgs $;

        public Builder() {
            $ = new FileServerReadSettingsArgs();
        }

        public Builder(FileServerReadSettingsArgs defaults) {
            $ = new FileServerReadSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteFilesAfterCompletion(@Nullable Output<Object> deleteFilesAfterCompletion) {
            $.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }

        public Builder deleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
            return deleteFilesAfterCompletion(Output.of(deleteFilesAfterCompletion));
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        public Builder enablePartitionDiscovery(@Nullable Output<Boolean> enablePartitionDiscovery) {
            $.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        public Builder enablePartitionDiscovery(Boolean enablePartitionDiscovery) {
            return enablePartitionDiscovery(Output.of(enablePartitionDiscovery));
        }

        public Builder fileFilter(@Nullable Output<Object> fileFilter) {
            $.fileFilter = fileFilter;
            return this;
        }

        public Builder fileFilter(Object fileFilter) {
            return fileFilter(Output.of(fileFilter));
        }

        public Builder fileListPath(@Nullable Output<Object> fileListPath) {
            $.fileListPath = fileListPath;
            return this;
        }

        public Builder fileListPath(Object fileListPath) {
            return fileListPath(Output.of(fileListPath));
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        public Builder modifiedDatetimeEnd(@Nullable Output<Object> modifiedDatetimeEnd) {
            $.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        public Builder modifiedDatetimeEnd(Object modifiedDatetimeEnd) {
            return modifiedDatetimeEnd(Output.of(modifiedDatetimeEnd));
        }

        public Builder modifiedDatetimeStart(@Nullable Output<Object> modifiedDatetimeStart) {
            $.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        public Builder modifiedDatetimeStart(Object modifiedDatetimeStart) {
            return modifiedDatetimeStart(Output.of(modifiedDatetimeStart));
        }

        public Builder partitionRootPath(@Nullable Output<Object> partitionRootPath) {
            $.partitionRootPath = partitionRootPath;
            return this;
        }

        public Builder partitionRootPath(Object partitionRootPath) {
            return partitionRootPath(Output.of(partitionRootPath));
        }

        public Builder recursive(@Nullable Output<Object> recursive) {
            $.recursive = recursive;
            return this;
        }

        public Builder recursive(Object recursive) {
            return recursive(Output.of(recursive));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder wildcardFileName(@Nullable Output<Object> wildcardFileName) {
            $.wildcardFileName = wildcardFileName;
            return this;
        }

        public Builder wildcardFileName(Object wildcardFileName) {
            return wildcardFileName(Output.of(wildcardFileName));
        }

        public Builder wildcardFolderPath(@Nullable Output<Object> wildcardFolderPath) {
            $.wildcardFolderPath = wildcardFolderPath;
            return this;
        }

        public Builder wildcardFolderPath(Object wildcardFolderPath) {
            return wildcardFolderPath(Output.of(wildcardFolderPath));
        }

        public FileServerReadSettingsArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
