// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information of current state for an Azure SQL Database, Server or Elastic Pool Recommended Action.
 * 
 */
public final class RecommendedActionStateInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecommendedActionStateInfoResponse Empty = new RecommendedActionStateInfoResponse();

    /**
     * Gets who initiated the execution of this recommended action. Possible Value are: User    -&gt; When user explicity notified system to apply the recommended action. System  -&gt; When auto-execute status of this advisor was set to &#39;Enabled&#39;, in which case the system applied it.
     * 
     */
    @Import(name="actionInitiatedBy", required=true)
    private String actionInitiatedBy;

    public String actionInitiatedBy() {
        return this.actionInitiatedBy;
    }

    /**
     * Current state the recommended action is in. Some commonly used states are: Active      -&gt; recommended action is active and no action has been taken yet. Pending     -&gt; recommended action is approved for and is awaiting execution. Executing   -&gt; recommended action is being applied on the user database. Verifying   -&gt; recommended action was applied and is being verified of its usefulness by the system. Success     -&gt; recommended action was applied and improvement found during verification. Pending Revert  -&gt; verification found little or no improvement so recommended action is queued for revert or user has manually reverted. Reverting   -&gt; changes made while applying recommended action are being reverted on the user database. Reverted    -&gt; successfully reverted the changes made by recommended action on user database. Ignored     -&gt; user explicitly ignored/discarded the recommended action.
     * 
     */
    @Import(name="currentValue", required=true)
    private String currentValue;

    public String currentValue() {
        return this.currentValue;
    }

    /**
     * Gets the time when the state was last modified
     * 
     */
    @Import(name="lastModified", required=true)
    private String lastModified;

    public String lastModified() {
        return this.lastModified;
    }

    private RecommendedActionStateInfoResponse() {}

    private RecommendedActionStateInfoResponse(RecommendedActionStateInfoResponse $) {
        this.actionInitiatedBy = $.actionInitiatedBy;
        this.currentValue = $.currentValue;
        this.lastModified = $.lastModified;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecommendedActionStateInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecommendedActionStateInfoResponse $;

        public Builder() {
            $ = new RecommendedActionStateInfoResponse();
        }

        public Builder(RecommendedActionStateInfoResponse defaults) {
            $ = new RecommendedActionStateInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder actionInitiatedBy(String actionInitiatedBy) {
            $.actionInitiatedBy = actionInitiatedBy;
            return this;
        }

        public Builder currentValue(String currentValue) {
            $.currentValue = currentValue;
            return this;
        }

        public Builder lastModified(String lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        public RecommendedActionStateInfoResponse build() {
            $.actionInitiatedBy = Objects.requireNonNull($.actionInitiatedBy, "expected parameter 'actionInitiatedBy' to be non-null");
            $.currentValue = Objects.requireNonNull($.currentValue, "expected parameter 'currentValue' to be non-null");
            $.lastModified = Objects.requireNonNull($.lastModified, "expected parameter 'lastModified' to be non-null");
            return $;
        }
    }

}
