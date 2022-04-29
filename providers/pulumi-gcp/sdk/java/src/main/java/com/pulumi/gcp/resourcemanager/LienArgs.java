// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.resourcemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LienArgs extends ResourceArgs {

    public static final LienArgs Empty = new LienArgs();

    /**
     * A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    @Import(name="origin", required=true)
    private Output<String> origin;

    /**
     * @return A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }

    /**
     * A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. &#34;projects/my-project-name&#34;).
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. &#34;projects/my-project-name&#34;).
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     * Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    @Import(name="reason", required=true)
    private Output<String> reason;

    /**
     * @return Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    public Output<String> reason() {
        return this.reason;
    }

    /**
     * The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    @Import(name="restrictions", required=true)
    private Output<List<String>> restrictions;

    /**
     * @return The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    public Output<List<String>> restrictions() {
        return this.restrictions;
    }

    private LienArgs() {}

    private LienArgs(LienArgs $) {
        this.origin = $.origin;
        this.parent = $.parent;
        this.reason = $.reason;
        this.restrictions = $.restrictions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LienArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LienArgs $;

        public Builder() {
            $ = new LienArgs();
        }

        public Builder(LienArgs defaults) {
            $ = new LienArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param origin A stable, user-visible/meaningful string identifying the origin
         * of the Lien, intended to be inspected programmatically. Maximum length of
         * 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder origin(Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin A stable, user-visible/meaningful string identifying the origin
         * of the Lien, intended to be inspected programmatically. Maximum length of
         * 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        /**
         * @param parent A reference to the resource this Lien is attached to.
         * The server will validate the parent against those for which Liens are supported.
         * Since a variety of objects can have Liens against them, you must provide the type
         * prefix (e.g. &#34;projects/my-project-name&#34;).
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent A reference to the resource this Lien is attached to.
         * The server will validate the parent against those for which Liens are supported.
         * Since a variety of objects can have Liens against them, you must provide the type
         * prefix (e.g. &#34;projects/my-project-name&#34;).
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param reason Concise user-visible strings indicating why an action cannot be performed
         * on a resource. Maximum length of 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder reason(Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason Concise user-visible strings indicating why an action cannot be performed
         * on a resource. Maximum length of 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien.
         * Each value should correspond to an IAM permission. The server will validate
         * the permissions against those for which Liens are supported.  An empty
         * list is meaningless and will be rejected.
         * e.g. [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(Output<List<String>> restrictions) {
            $.restrictions = restrictions;
            return this;
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien.
         * Each value should correspond to an IAM permission. The server will validate
         * the permissions against those for which Liens are supported.  An empty
         * list is meaningless and will be rejected.
         * e.g. [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(List<String> restrictions) {
            return restrictions(Output.of(restrictions));
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien.
         * Each value should correspond to an IAM permission. The server will validate
         * the permissions against those for which Liens are supported.  An empty
         * list is meaningless and will be rejected.
         * e.g. [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(String... restrictions) {
            return restrictions(List.of(restrictions));
        }

        public LienArgs build() {
            $.origin = Objects.requireNonNull($.origin, "expected parameter 'origin' to be non-null");
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.reason = Objects.requireNonNull($.reason, "expected parameter 'reason' to be non-null");
            $.restrictions = Objects.requireNonNull($.restrictions, "expected parameter 'restrictions' to be non-null");
            return $;
        }
    }

}
