// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.FilterTrackPropertyConditionResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Representing a list of FilterTrackPropertyConditions to select a track.  The filters are combined using a logical AND operation.
 * 
 */
public final class FilterTrackSelectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final FilterTrackSelectionResponse Empty = new FilterTrackSelectionResponse();

    /**
     * The track selections.
     * 
     */
    @Import(name="trackSelections", required=true)
    private List<FilterTrackPropertyConditionResponse> trackSelections;

    public List<FilterTrackPropertyConditionResponse> trackSelections() {
        return this.trackSelections;
    }

    private FilterTrackSelectionResponse() {}

    private FilterTrackSelectionResponse(FilterTrackSelectionResponse $) {
        this.trackSelections = $.trackSelections;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterTrackSelectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterTrackSelectionResponse $;

        public Builder() {
            $ = new FilterTrackSelectionResponse();
        }

        public Builder(FilterTrackSelectionResponse defaults) {
            $ = new FilterTrackSelectionResponse(Objects.requireNonNull(defaults));
        }

        public Builder trackSelections(List<FilterTrackPropertyConditionResponse> trackSelections) {
            $.trackSelections = trackSelections;
            return this;
        }

        public Builder trackSelections(FilterTrackPropertyConditionResponse... trackSelections) {
            return trackSelections(List.of(trackSelections));
        }

        public FilterTrackSelectionResponse build() {
            $.trackSelections = Objects.requireNonNull($.trackSelections, "expected parameter 'trackSelections' to be non-null");
            return $;
        }
    }

}
