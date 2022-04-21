// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * PullRequestFilter contains filter properties for matching GitHub Pull Requests.
 * 
 */
public final class PullRequestFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final PullRequestFilterResponse Empty = new PullRequestFilterResponse();

    /**
     * Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="branch", required=true)
    private String branch;

    public String branch() {
        return this.branch;
    }

    /**
     * Configure builds to run whether a repository owner or collaborator need to comment `/gcbrun`.
     * 
     */
    @Import(name="commentControl", required=true)
    private String commentControl;

    public String commentControl() {
        return this.commentControl;
    }

    /**
     * If true, branches that do NOT match the git_ref will trigger a build.
     * 
     */
    @Import(name="invertRegex", required=true)
    private Boolean invertRegex;

    public Boolean invertRegex() {
        return this.invertRegex;
    }

    private PullRequestFilterResponse() {}

    private PullRequestFilterResponse(PullRequestFilterResponse $) {
        this.branch = $.branch;
        this.commentControl = $.commentControl;
        this.invertRegex = $.invertRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PullRequestFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PullRequestFilterResponse $;

        public Builder() {
            $ = new PullRequestFilterResponse();
        }

        public Builder(PullRequestFilterResponse defaults) {
            $ = new PullRequestFilterResponse(Objects.requireNonNull(defaults));
        }

        public Builder branch(String branch) {
            $.branch = branch;
            return this;
        }

        public Builder commentControl(String commentControl) {
            $.commentControl = commentControl;
            return this;
        }

        public Builder invertRegex(Boolean invertRegex) {
            $.invertRegex = invertRegex;
            return this;
        }

        public PullRequestFilterResponse build() {
            $.branch = Objects.requireNonNull($.branch, "expected parameter 'branch' to be non-null");
            $.commentControl = Objects.requireNonNull($.commentControl, "expected parameter 'commentControl' to be non-null");
            $.invertRegex = Objects.requireNonNull($.invertRegex, "expected parameter 'invertRegex' to be non-null");
            return $;
        }
    }

}
