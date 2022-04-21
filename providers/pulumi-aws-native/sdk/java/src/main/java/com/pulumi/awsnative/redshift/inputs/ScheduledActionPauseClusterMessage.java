// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a pause cluster operation. For example, a scheduled action to run the `PauseCluster` API operation.
 * 
 */
public final class ScheduledActionPauseClusterMessage extends com.pulumi.resources.InvokeArgs {

    public static final ScheduledActionPauseClusterMessage Empty = new ScheduledActionPauseClusterMessage();

    @Import(name="clusterIdentifier", required=true)
    private String clusterIdentifier;

    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }

    private ScheduledActionPauseClusterMessage() {}

    private ScheduledActionPauseClusterMessage(ScheduledActionPauseClusterMessage $) {
        this.clusterIdentifier = $.clusterIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledActionPauseClusterMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledActionPauseClusterMessage $;

        public Builder() {
            $ = new ScheduledActionPauseClusterMessage();
        }

        public Builder(ScheduledActionPauseClusterMessage defaults) {
            $ = new ScheduledActionPauseClusterMessage(Objects.requireNonNull(defaults));
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        public ScheduledActionPauseClusterMessage build() {
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            return $;
        }
    }

}
