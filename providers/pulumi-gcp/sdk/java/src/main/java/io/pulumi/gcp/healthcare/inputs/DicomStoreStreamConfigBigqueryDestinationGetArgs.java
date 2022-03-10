// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DicomStoreStreamConfigBigqueryDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreStreamConfigBigqueryDestinationGetArgs Empty = new DicomStoreStreamConfigBigqueryDestinationGetArgs();

    /**
     * a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     * 
     */
    @InputImport(name="tableUri", required=true)
      private final Input<String> tableUri;

    public Input<String> getTableUri() {
        return this.tableUri;
    }

    public DicomStoreStreamConfigBigqueryDestinationGetArgs(Input<String> tableUri) {
        this.tableUri = Objects.requireNonNull(tableUri, "expected parameter 'tableUri' to be non-null");
    }

    private DicomStoreStreamConfigBigqueryDestinationGetArgs() {
        this.tableUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreStreamConfigBigqueryDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> tableUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreStreamConfigBigqueryDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableUri = defaults.tableUri;
        }

        public Builder tableUri(Input<String> tableUri) {
            this.tableUri = Objects.requireNonNull(tableUri);
            return this;
        }

        public Builder tableUri(String tableUri) {
            this.tableUri = Input.of(Objects.requireNonNull(tableUri));
            return this;
        }
        public DicomStoreStreamConfigBigqueryDestinationGetArgs build() {
            return new DicomStoreStreamConfigBigqueryDestinationGetArgs(tableUri);
        }
    }
}
