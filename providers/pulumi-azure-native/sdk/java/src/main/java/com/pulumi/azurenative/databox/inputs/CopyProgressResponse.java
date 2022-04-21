// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Copy progress.
 * 
 */
public final class CopyProgressResponse extends com.pulumi.resources.InvokeArgs {

    public static final CopyProgressResponse Empty = new CopyProgressResponse();

    /**
     * Id of the account where the data needs to be uploaded.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    public String accountId() {
        return this.accountId;
    }

    /**
     * To indicate bytes transferred.
     * 
     */
    @Import(name="bytesProcessed", required=true)
    private Double bytesProcessed;

    public Double bytesProcessed() {
        return this.bytesProcessed;
    }

    /**
     * Data Account Type.
     * 
     */
    @Import(name="dataAccountType", required=true)
    private String dataAccountType;

    public String dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * To indicate directories errored out in the job.
     * 
     */
    @Import(name="directoriesErroredOut", required=true)
    private Double directoriesErroredOut;

    public Double directoriesErroredOut() {
        return this.directoriesErroredOut;
    }

    /**
     * Number of files which could not be copied
     * 
     */
    @Import(name="filesErroredOut", required=true)
    private Double filesErroredOut;

    public Double filesErroredOut() {
        return this.filesErroredOut;
    }

    /**
     * Number of files processed
     * 
     */
    @Import(name="filesProcessed", required=true)
    private Double filesProcessed;

    public Double filesProcessed() {
        return this.filesProcessed;
    }

    /**
     * To indicate directories renamed
     * 
     */
    @Import(name="invalidDirectoriesProcessed", required=true)
    private Double invalidDirectoriesProcessed;

    public Double invalidDirectoriesProcessed() {
        return this.invalidDirectoriesProcessed;
    }

    /**
     * Total amount of data not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @Import(name="invalidFileBytesUploaded", required=true)
    private Double invalidFileBytesUploaded;

    public Double invalidFileBytesUploaded() {
        return this.invalidFileBytesUploaded;
    }

    /**
     * Number of files not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @Import(name="invalidFilesProcessed", required=true)
    private Double invalidFilesProcessed;

    public Double invalidFilesProcessed() {
        return this.invalidFilesProcessed;
    }

    /**
     * To indicate if enumeration of data is in progress.
     * Until this is true, the TotalBytesToProcess may not be valid.
     * 
     */
    @Import(name="isEnumerationInProgress", required=true)
    private Boolean isEnumerationInProgress;

    public Boolean isEnumerationInProgress() {
        return this.isEnumerationInProgress;
    }

    /**
     * Number of folders not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @Import(name="renamedContainerCount", required=true)
    private Double renamedContainerCount;

    public Double renamedContainerCount() {
        return this.renamedContainerCount;
    }

    /**
     * Name of the storage account. This will be empty for data account types other than storage account.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private String storageAccountName;

    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Total amount of data to be processed by the job.
     * 
     */
    @Import(name="totalBytesToProcess", required=true)
    private Double totalBytesToProcess;

    public Double totalBytesToProcess() {
        return this.totalBytesToProcess;
    }

    /**
     * Total files to process
     * 
     */
    @Import(name="totalFilesToProcess", required=true)
    private Double totalFilesToProcess;

    public Double totalFilesToProcess() {
        return this.totalFilesToProcess;
    }

    /**
     * Transfer type of data
     * 
     */
    @Import(name="transferType", required=true)
    private String transferType;

    public String transferType() {
        return this.transferType;
    }

    private CopyProgressResponse() {}

    private CopyProgressResponse(CopyProgressResponse $) {
        this.accountId = $.accountId;
        this.bytesProcessed = $.bytesProcessed;
        this.dataAccountType = $.dataAccountType;
        this.directoriesErroredOut = $.directoriesErroredOut;
        this.filesErroredOut = $.filesErroredOut;
        this.filesProcessed = $.filesProcessed;
        this.invalidDirectoriesProcessed = $.invalidDirectoriesProcessed;
        this.invalidFileBytesUploaded = $.invalidFileBytesUploaded;
        this.invalidFilesProcessed = $.invalidFilesProcessed;
        this.isEnumerationInProgress = $.isEnumerationInProgress;
        this.renamedContainerCount = $.renamedContainerCount;
        this.storageAccountName = $.storageAccountName;
        this.totalBytesToProcess = $.totalBytesToProcess;
        this.totalFilesToProcess = $.totalFilesToProcess;
        this.transferType = $.transferType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CopyProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CopyProgressResponse $;

        public Builder() {
            $ = new CopyProgressResponse();
        }

        public Builder(CopyProgressResponse defaults) {
            $ = new CopyProgressResponse(Objects.requireNonNull(defaults));
        }

        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder bytesProcessed(Double bytesProcessed) {
            $.bytesProcessed = bytesProcessed;
            return this;
        }

        public Builder dataAccountType(String dataAccountType) {
            $.dataAccountType = dataAccountType;
            return this;
        }

        public Builder directoriesErroredOut(Double directoriesErroredOut) {
            $.directoriesErroredOut = directoriesErroredOut;
            return this;
        }

        public Builder filesErroredOut(Double filesErroredOut) {
            $.filesErroredOut = filesErroredOut;
            return this;
        }

        public Builder filesProcessed(Double filesProcessed) {
            $.filesProcessed = filesProcessed;
            return this;
        }

        public Builder invalidDirectoriesProcessed(Double invalidDirectoriesProcessed) {
            $.invalidDirectoriesProcessed = invalidDirectoriesProcessed;
            return this;
        }

        public Builder invalidFileBytesUploaded(Double invalidFileBytesUploaded) {
            $.invalidFileBytesUploaded = invalidFileBytesUploaded;
            return this;
        }

        public Builder invalidFilesProcessed(Double invalidFilesProcessed) {
            $.invalidFilesProcessed = invalidFilesProcessed;
            return this;
        }

        public Builder isEnumerationInProgress(Boolean isEnumerationInProgress) {
            $.isEnumerationInProgress = isEnumerationInProgress;
            return this;
        }

        public Builder renamedContainerCount(Double renamedContainerCount) {
            $.renamedContainerCount = renamedContainerCount;
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public Builder totalBytesToProcess(Double totalBytesToProcess) {
            $.totalBytesToProcess = totalBytesToProcess;
            return this;
        }

        public Builder totalFilesToProcess(Double totalFilesToProcess) {
            $.totalFilesToProcess = totalFilesToProcess;
            return this;
        }

        public Builder transferType(String transferType) {
            $.transferType = transferType;
            return this;
        }

        public CopyProgressResponse build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.bytesProcessed = Objects.requireNonNull($.bytesProcessed, "expected parameter 'bytesProcessed' to be non-null");
            $.dataAccountType = Objects.requireNonNull($.dataAccountType, "expected parameter 'dataAccountType' to be non-null");
            $.directoriesErroredOut = Objects.requireNonNull($.directoriesErroredOut, "expected parameter 'directoriesErroredOut' to be non-null");
            $.filesErroredOut = Objects.requireNonNull($.filesErroredOut, "expected parameter 'filesErroredOut' to be non-null");
            $.filesProcessed = Objects.requireNonNull($.filesProcessed, "expected parameter 'filesProcessed' to be non-null");
            $.invalidDirectoriesProcessed = Objects.requireNonNull($.invalidDirectoriesProcessed, "expected parameter 'invalidDirectoriesProcessed' to be non-null");
            $.invalidFileBytesUploaded = Objects.requireNonNull($.invalidFileBytesUploaded, "expected parameter 'invalidFileBytesUploaded' to be non-null");
            $.invalidFilesProcessed = Objects.requireNonNull($.invalidFilesProcessed, "expected parameter 'invalidFilesProcessed' to be non-null");
            $.isEnumerationInProgress = Objects.requireNonNull($.isEnumerationInProgress, "expected parameter 'isEnumerationInProgress' to be non-null");
            $.renamedContainerCount = Objects.requireNonNull($.renamedContainerCount, "expected parameter 'renamedContainerCount' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            $.totalBytesToProcess = Objects.requireNonNull($.totalBytesToProcess, "expected parameter 'totalBytesToProcess' to be non-null");
            $.totalFilesToProcess = Objects.requireNonNull($.totalFilesToProcess, "expected parameter 'totalFilesToProcess' to be non-null");
            $.transferType = Objects.requireNonNull($.transferType, "expected parameter 'transferType' to be non-null");
            return $;
        }
    }

}
