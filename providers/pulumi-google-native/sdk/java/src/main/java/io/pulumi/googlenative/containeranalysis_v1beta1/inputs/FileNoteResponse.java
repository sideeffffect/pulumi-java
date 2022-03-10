// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * FileNote represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-information/
 * 
 */
public final class FileNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final FileNoteResponse Empty = new FileNoteResponse();

    /**
     * Provide a unique identifier to match analysis information on each specific file in a package
     * 
     */
    @InputImport(name="checksum", required=true)
      private final List<String> checksum;

    public List<String> getChecksum() {
        return this.checksum;
    }

    /**
     * This field provides information about the type of file identified
     * 
     */
    @InputImport(name="fileType", required=true)
      private final String fileType;

    public String getFileType() {
        return this.fileType;
    }

    /**
     * Identify the full path and filename that corresponds to the file information in this section
     * 
     */
    @InputImport(name="title", required=true)
      private final String title;

    public String getTitle() {
        return this.title;
    }

    public FileNoteResponse(
        List<String> checksum,
        String fileType,
        String title) {
        this.checksum = Objects.requireNonNull(checksum, "expected parameter 'checksum' to be non-null");
        this.fileType = Objects.requireNonNull(fileType, "expected parameter 'fileType' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private FileNoteResponse() {
        this.checksum = List.of();
        this.fileType = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> checksum;
        private String fileType;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(FileNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.fileType = defaults.fileType;
    	      this.title = defaults.title;
        }

        public Builder checksum(List<String> checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }

        public Builder fileType(String fileType) {
            this.fileType = Objects.requireNonNull(fileType);
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public FileNoteResponse build() {
            return new FileNoteResponse(checksum, fileType, title);
        }
    }
}
