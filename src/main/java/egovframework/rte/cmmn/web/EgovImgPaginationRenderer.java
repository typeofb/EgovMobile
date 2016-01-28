package egovframework.rte.cmmn.web;

import egovframework.rte.ptl.mvc.tags.ui.pagination.AbstractPaginationRenderer;

public class EgovImgPaginationRenderer extends AbstractPaginationRenderer {

	public EgovImgPaginationRenderer() {
		firstPageLabel = "<a href=\"javascript:{0}({1}); return false;\" class=\"first\" onclick=\"{0}({1}); return false;\">" + "</a>";
		previousPageLabel = "<a href=\"javascript:{0}({1}); return false;\" class=\"prev\" onclick=\"{0}({1}); return false;\">" + "</a>";
		currentPageLabel = "<span><strong>{0}</strong></span>";
		otherPageLabel = "<span><a href=\"javascript:{0}({1});\" data-role=\"none\">{2}</a></span>";
		nextPageLabel = "<a href=\"javascript:{0}({1}); return false;\" class=\"next\" onclick=\"{0}({1}); return false;\">" + "</a>";
		lastPageLabel = "<a href=\"javascript:{0}({1}); return false;\" class=\"last\" onclick=\"{0}({1}); return false;\">" + "</a>";
	}
}
