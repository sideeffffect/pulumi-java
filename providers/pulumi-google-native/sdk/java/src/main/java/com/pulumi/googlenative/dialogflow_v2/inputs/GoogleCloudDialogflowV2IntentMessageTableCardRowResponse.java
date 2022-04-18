// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageTableCardCellResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


/**
 * Row of TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageTableCardRowResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageTableCardRowResponse Empty = new GoogleCloudDialogflowV2IntentMessageTableCardRowResponse();

    /**
     * Optional. List of cells that make up this row.
     * 
     */
    @Import(name="cells", required=true)
      private final List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells;

    public List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells() {
        return this.cells;
    }

    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    @Import(name="dividerAfter", required=true)
      private final Boolean dividerAfter;

    public Boolean dividerAfter() {
        return this.dividerAfter;
    }

    public GoogleCloudDialogflowV2IntentMessageTableCardRowResponse(
        List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells,
        Boolean dividerAfter) {
        this.cells = Objects.requireNonNull(cells, "expected parameter 'cells' to be non-null");
        this.dividerAfter = Objects.requireNonNull(dividerAfter, "expected parameter 'dividerAfter' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageTableCardRowResponse() {
        this.cells = List.of();
        this.dividerAfter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells;
        private Boolean dividerAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.dividerAfter = defaults.dividerAfter;
        }

        public Builder cells(List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells) {
            this.cells = Objects.requireNonNull(cells);
            return this;
        }
        public Builder cells(GoogleCloudDialogflowV2IntentMessageTableCardCellResponse... cells) {
            return cells(List.of(cells));
        }
        public Builder dividerAfter(Boolean dividerAfter) {
            this.dividerAfter = Objects.requireNonNull(dividerAfter);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageTableCardRowResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageTableCardRowResponse(cells, dividerAfter);
        }
    }
}
